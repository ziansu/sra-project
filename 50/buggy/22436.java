public rfid.service.RFIDService.getTransportInfo_result getResult(I iface, rfid.service.RFIDService.getTransportInfo_args args) throws org.apache.thrift.TException {
    rfid.service.RFIDService.getTransportInfo_result result = new rfid.service.RFIDService.getTransportInfo_result();
    result.success = iface.getTransportInfo(args.applyDocCode);
    return result;
}