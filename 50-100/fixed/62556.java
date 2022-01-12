public void respondWithGetRefundById(java.lang.String gatewayAccountId, java.lang.String chargeId, java.lang.String refundId, int amount, java.lang.String refundStatus, java.lang.String createdDate) {
    java.lang.String refundResponse = buildGetRefundResponse(refundId, amount, refundStatus, createdDate);
    whenGetRefundById(gatewayAccountId, chargeId, refundId).respond(org.mockserver.model.HttpResponse.response().withStatusCode(uk.gov.pay.api.utils.OK_200).withHeader(uk.gov.pay.api.utils.CONTENT_TYPE, javax.ws.rs.core.MediaType.APPLICATION_JSON).withBody(refundResponse));
}