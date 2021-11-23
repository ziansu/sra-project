@java.lang.Override
public boolean isMatch(org.bubblecloud.zigbee.v3.Command request, org.bubblecloud.zigbee.v3.Command response) {
    if ((((org.bubblecloud.zigbee.v3.zcl.ZclCommand) (request)).getTransactionId()) != null) {
        final byte transactionId = ((org.bubblecloud.zigbee.v3.zcl.ZclCommand) (request)).getTransactionId();
        return new java.lang.Byte(transactionId).equals(((org.bubblecloud.zigbee.v3.zcl.ZclCommand) (response)).getTransactionId());
    }else {
        return false;
    }
}