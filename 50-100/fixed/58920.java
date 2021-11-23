private static java.lang.String decodeStringToDefaultCharSet(final java.lang.String input) {
    java.lang.String decodedValue = input;
    try {
        decodedValue = new java.lang.String(input.getBytes("ISO-8859-1"), password.pwm.PwmConstants.DEFAULT_CHARSET);
    } catch (java.io.UnsupportedEncodingException e) {
        password.pwm.http.PwmHttpRequestWrapper.LOGGER.error(("error decoding request parameter: " + (e.getMessage())));
    }
    return decodedValue;
}