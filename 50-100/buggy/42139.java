@org.springframework.web.bind.annotation.ExceptionHandler(value = org.springframework.security.oauth2.common.exceptions.OAuth2Exception.class)
public org.springframework.http.ResponseEntity<org.springframework.security.oauth2.common.exceptions.OAuth2Exception> handleException(java.lang.Exception e) throws java.lang.Exception {
    logger.info(((("Handling error: " + (e.getClass().getSimpleName())) + ", ") + (e.getMessage())));
    return getExceptionTranslator().translate(e);
}