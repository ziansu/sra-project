@com.FoodCourtServer.controller.RequestMapping(value = "/get-tenants", method = RequestMethod.GET)
org.springframework.http.ResponseEntity<?> getTenants() {
    com.FoodCourtServer.controller.TenantController.LOGGER.info("fetching Tenants");
    java.util.List<com.FoodCourtServer.model.Tenant> tenants = tenantService.getTenants();
    if (tenants == null) {
        com.FoodCourtServer.controller.TenantController.LOGGER.error("Tenant not found");
        return new org.springframework.http.ResponseEntity(new com.FoodCourtServer.util.CustomErrorType("Tenant not found"), org.springframework.http.HttpStatus.NOT_FOUND);
    }
    return new org.springframework.http.ResponseEntity(tenants, org.springframework.http.HttpStatus.OK);
}