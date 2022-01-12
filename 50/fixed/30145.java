public void send_getTransportInfo() throws org.apache.thrift.TException {
    rfid.service.RFIDService.getTransportInfo_args args = new rfid.service.RFIDService.getTransportInfo_args();
    sendBase("getTransportInfo", args);
}