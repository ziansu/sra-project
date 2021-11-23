public java.util.List<rfid.service.rfid.service.transportInfo> getTransportInfo(java.lang.String applyDocCode) throws org.apache.thrift.TException {
    send_getTransportInfo(applyDocCode);
    return recv_getTransportInfo();
}