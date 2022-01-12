private boolean validateRequest(javax.servlet.http.HttpServletRequest request) {
    org.twilio.smsmarketing.lib.RequestParametersValidator validator = new org.twilio.smsmarketing.lib.RequestParametersValidator(request);
    return validator.validatePresence("message", "imageUrl");
}