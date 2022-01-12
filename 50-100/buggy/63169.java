public void asyncSend(asset.Classifier ob, byte header) {
    while ((sendFlag) == true) {
    } 
    while ((sendFlag) == false) {
        sendData = tcpIp.Converter.serialize(ob, header);
        java.lang.System.out.println(("asyncSend:" + (ob.getClassName())));
        sendFlag = true;
    } 
}