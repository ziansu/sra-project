private javax.servlet.sip.SipServletResponse.SipServletResponse create200OkWithAllBindings(com.berinchik.sip.SipServletRequest request, com.berinchik.sip.service.registrar.Registrar registrar) throws com.berinchik.sip.ServletParseException, java.sql.SQLException {
    java.lang.String cleanToUri = cleanUri(request.getTo());
    javax.servlet.sip.SipServletResponse.SipServletResponse resp = request.createResponse(com.berinchik.sip.SC_OK, "Ok");
    addContactHeaders(resp, registrar.getBindings(cleanToUri));
    resp.removeHeader(com.berinchik.sip.FlexibleCommunicationService.SC_EXPIRES_HEADER);
    return resp;
}