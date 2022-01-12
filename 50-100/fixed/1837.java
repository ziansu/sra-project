private void sendTrapV2C(org.snmp4j.PDU pdu, org.snmp4j.CommunityTarget target) {
    try {
        snmp.send(pdu, target);
        logger.info(("SnmpTrapSender.sendTrapV2C(): PDU = " + (pdu.toString())));
    } catch (java.lang.Exception e) {
        logger.error(("SnmpTrapSender.sendTrapV2C(): Error sending V2C trap to " + (target.getAddress())), e);
    }
}