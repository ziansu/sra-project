private com.cusbee.yoki.service.serviceimpl.Client parseClient(com.cusbee.yoki.model.ClientModel customerData) {
    com.cusbee.yoki.service.serviceimpl.Client client = clientService.get(customerData.getPhone());
    if (client == null) {
        client = new com.cusbee.yoki.service.serviceimpl.Client();
        client.setPhoneNumber(customerData.getPhone());
    }
    client.setName(customerData.getName());
    client.setAddress(customerData.getAddress());
    return client;
}