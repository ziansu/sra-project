@java.lang.Override
protected void writeData(int[] data, java.util.Map<java.lang.String, java.lang.Object> context) throws java.lang.Exception {
    com.rapplogic.xbee.api.XBeeAddress64 address = ((com.rapplogic.xbee.api.XBeeAddress64) (context.get("xbeeAddress")));
    try {
        xbee.sendSynchronous(new com.rapplogic.xbee.api.zigbee.ZNetTxRequest(address, data), 500);
    } catch (com.rapplogic.xbee.api.XBeeTimeoutException e) {
        java.lang.System.out.println("No tx ack after 500ms");
    }
}