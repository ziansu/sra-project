@com.itechart.warehouse.controller.RequestMapping(value = "/save/{email:.+}", method = RequestMethod.POST, consumes = "application/json")
public org.springframework.http.ResponseEntity<com.itechart.warehouse.entity.User> saveCompany(@javax.validation.Valid
@com.itechart.warehouse.controller.RequestBody
com.itechart.warehouse.entity.WarehouseCompany warehouseCompany, @com.itechart.warehouse.controller.PathVariable
java.lang.String email) {
    logger.info("POST on /company: save new company");
    com.itechart.warehouse.entity.User user;
    try {
        user = warehouseCompanyService.saveWarehouseCompany(warehouseCompany, email);
        if (user == null) {
            return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE);
        }
    } catch (com.itechart.warehouse.service.exception.DataAccessException e) {
        logger.error("Error while saving new company", e);
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.CONFLICT);
    }
    return new org.springframework.http.ResponseEntity(user, org.springframework.http.HttpStatus.CREATED);
}