public com.ebaotech.salesplatform.domain.CustomerSearch convertCustomerSearchModelToDomain(com.ebaotech.salesplatform.mvp.view.model.customer.CustomerSearchModel customerSearchModel) {
    com.ebaotech.salesplatform.domain.CustomerSearch customerSearch = new com.ebaotech.salesplatform.domain.CustomerSearch();
    customerSearch.setName(customerSearchModel.getName());
    customerSearch.setGender(customerSearchModel.getGender());
    customerSearch.setAgeFrom(customerSearchModel.getAgeFrom());
    customerSearch.setAgeTo(customerSearchModel.getAgeTo());
    customerSearch.setIdNumber(customerSearch.getIdNumber());
    return customerSearch;
}