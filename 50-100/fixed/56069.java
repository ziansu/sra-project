@java.lang.Override
public void callback(org.jlab.clara.monitor.dc.timeline.xMsgMessage msg) {
    org.jlab.clara.monitor.dc.timeline.Builder metadata = msg.getMetaData();
    if (metadata.getDataType().equals(xMsgMimeType.STRING)) {
        java.lang.String jsonString = new java.lang.String(msg.getData());
        report(jsonString);
    }
}