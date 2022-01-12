private void setWarehouseCompanyField(java.lang.Long warehouseCompanyId, com.itechart.warehouse.entity.User updatableUser) throws com.itechart.warehouse.service.exception.DataAccessException, com.itechart.warehouse.service.exception.IllegalParametersException, com.itechart.warehouse.service.exception.ResourceNotFoundException {
    org.springframework.util.Assert.notNull(warehouseCompanyId, "Warehouse company id is null");
    org.springframework.util.Assert.notNull(updatableUser, com.itechart.warehouse.service.impl.UserServiceImpl.ERROR_UPDATABLE_USER_IS_NULL);
    com.itechart.warehouse.entity.WarehouseCompany warehouseCompany = warehouseCompanyService.findWarehouseCompanyById(warehouseCompanyId);
    updatableUser.setWarehouseCompany(warehouseCompany);
}