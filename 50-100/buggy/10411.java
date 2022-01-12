public th.go.excise.edbarcode.ws.client.pcc.insert0112.oxm.InsertPOSO0112OperationResponse doService(th.go.excise.edbarcode.ws.client.pcc.insert0112.oxm.InsertPOSO0112Operation insertPOSO0112OperationRequest) {
    th.go.excise.edbarcode.ws.client.pcc.insert0112.oxm.InsertPOSO0112OperationResponse response = new th.go.excise.edbarcode.ws.client.pcc.insert0112.oxm.InsertPOSO0112OperationResponse();
    th.go.excise.edbarcode.ws.client.pcc.insert0112.client.InsertPOSO0112OperationServiceImpl.logger.info(" In  InsertPOSO112OperationService.doService ###");
    try {
        th.go.excise.edbarcode.ws.client.pcc.insert0112.client.InsertPOSO0112OperationServiceImpl.logger.info((" #####################################  :" + (insertPOSO0112OperationWsTemplate)));
        response = ((th.go.excise.edbarcode.ws.client.pcc.insert0112.oxm.InsertPOSO0112OperationResponse) (insertPOSO0112OperationWsTemplate.marshalSendAndReceive(insertPOSO0112OperationRequest)));
        th.go.excise.edbarcode.ws.client.pcc.insert0112.client.InsertPOSO0112OperationServiceImpl.logger.info((" ##################################### After Call InsertPOSO0112OperationService response:  " + response));
    } catch (java.lang.Exception ex) {
        th.go.excise.edbarcode.ws.client.pcc.insert0112.client.InsertPOSO0112OperationServiceImpl.logger.info((" ############## Error Call InsertPOSO0112OperationService :" + (ex.getMessage())));
        ex.printStackTrace();
    }
    return response;
}