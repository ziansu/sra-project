public void sendPrincipalData(final de.dimdi.sso.common.data.PrincipalData pData) throws javax.jms.JMSException {
    storePrincipalData(pData);
    pData.setSenderId(de.dimdi.sso.server.control.TopicHandler.SENDER_ID);
    send(pData, pDataTopic);
}