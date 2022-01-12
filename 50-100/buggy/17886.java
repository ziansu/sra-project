@java.lang.Override
protected java.lang.Boolean call() throws java.lang.Exception {
    java.util.List<org.menesty.ikea.domain.WarehouseItemDto> result = new java.util.ArrayList<>();
    for (org.menesty.ikea.processor.invoice.InvoiceItem item : org.menesty.ikea.service.ServiceFacade.getInvoiceItemService().loadBy(_invoice))
        result.add(convert(0, item));
    
    try {
        sendData(new com.google.gson.Gson().toJson(result));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    return true;
}