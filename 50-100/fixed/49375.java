protected void generateDetailedCDRs(java.util.ArrayList<org.mobicents.smsc.library.Sms> lstPermFailured, org.mobicents.smsc.library.EventType eventType, org.mobicents.smsc.library.ErrorCode errorCode, java.lang.String messageType, java.lang.String destAddrAndPort, int seqNumber) {
    for (org.mobicents.smsc.library.Sms sms : lstPermFailured) {
        org.mobicents.smsc.library.CdrDetailedGenerator.generateDetailedCdr(sms, eventType, errorCode, messageType, sms.getSmsSet().getSmppCommandStatus(), (-1), null, destAddrAndPort, seqNumber, org.mobicents.smsc.slee.services.deliverysbb.DeliveryCommonSbb.smscPropertiesManagement.getGenerateReceiptCdr(), org.mobicents.smsc.slee.services.deliverysbb.DeliveryCommonSbb.smscPropertiesManagement.getGenerateDetailedCdr());
    }
}