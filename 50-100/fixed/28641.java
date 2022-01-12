protected static boolean unsubscribeTest(java.lang.String spuid, boolean secure) {
    arces.unibo.SEPA.client.tools.SEPATest.unsubscriptionConfirmReceived = false;
    arces.unibo.SEPA.commons.request.UnsubscribeRequest unsub = new arces.unibo.SEPA.commons.request.UnsubscribeRequest(spuid);
    arces.unibo.SEPA.commons.response.Response response;
    if (!secure)
        response = arces.unibo.SEPA.client.tools.SEPATest.client.unsubscribe(unsub);
    else
        response = arces.unibo.SEPA.client.tools.SEPATest.client.secureUnsubscribe(unsub);
    
    arces.unibo.SEPA.client.tools.SEPATest.logger.debug(response.toString());
    return !(response.getClass().equals(arces.unibo.SEPA.commons.response.ErrorResponse.class));
}