@java.lang.Override
public java.lang.String sendSMS(java.lang.String CorpNum, java.lang.String sender, java.lang.String senderName, java.lang.String content, com.popbill.api.message.Message[] Messages, java.util.Date reserveDT, java.lang.Boolean adsYN, java.lang.String UserID) throws com.popbill.api.PopbillException {
    return sendMessage(MessageType.SMS, CorpNum, sender, null, senderName, content, Messages, reserveDT, adsYN, UserID);
}