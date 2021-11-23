public java.lang.String prepareList() {
    recreateModel();
    int custId = all.CustomersController.getCustomersInstance().getCustomerId();
    java.util.List list = ejbFacade.getByCustId(custId);
    items = new javax.faces.model.ListDataModel(list);
    return "List";
}