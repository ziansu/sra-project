public void getTransportInfo(java.lang.String applyDocCode, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
    checkReady();
    rfid.service.RFIDService.AsyncClient.getTransportInfo_call method_call = new rfid.service.RFIDService.AsyncClient.getTransportInfo_call(applyDocCode, resultHandler, this, ___protocolFactory, ___transport);
    this.___currentMethod = method_call;
    ___manager.call(method_call);
}