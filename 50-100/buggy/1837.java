private void sendTrapV2C(org.snmp4j.PDU pdu, org.snmp4j.CommunityTarget target) {
    try {
        java.lang.System.out.println(("Sending V2C Trap to " + (target.getAddress())));
        snmp.send(pdu, target);
        logger.info(("SnmpTrapSender.sendTrapV2C(): PDU = " + (pdu.toString())));
    } catch (java.lang.Exception e) {
        logger.error(("SnmpTrapSender.sendTrapV2C(): Error sending V2C trap to " + (target.getAddress())), e);
    }
}