@com.itechart.warehouse.controller.RequestMapping(value = "/{id}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.itechart.warehouse.entity.TransportCompany> readCompany(@com.itechart.warehouse.controller.PathVariable
java.lang.Long id) throws com.itechart.warehouse.service.exception.DataAccessException, com.itechart.warehouse.service.exception.IllegalParametersException, com.itechart.warehouse.service.exception.ResourceNotFoundException {
    com.itechart.warehouse.controller.TransportCompanyController.logger.info("GET on /tr-company/{}: find transport company by id");
    com.itechart.warehouse.security.WarehouseCompanyUserDetails userDetails = com.itechart.warehouse.security.UserDetailsProvider.getUserDetails();
    if (userDetails != null) {
        com.itechart.warehouse.entity.WarehouseCompany warehouseCompany = userDetails.getCompany();
        com.itechart.warehouse.entity.TransportCompany company = transportService.findTransportForCompanyById(id, warehouseCompany.getIdWarehouseCompany());
        return new org.springframework.http.ResponseEntity(company, org.springframework.http.HttpStatus.OK);
    }else {
        com.itechart.warehouse.controller.TransportCompanyController.logger.error("Failed to retrieve authenticated user while retrieving company");
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.UNAUTHORIZED);
    }
}