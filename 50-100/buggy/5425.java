@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
@org.springframework.web.bind.annotation.ResponseBody
org.springframework.http.ResponseEntity<?> handleControllerException(javax.servlet.http.HttpServletRequest request, java.lang.Throwable ex) {
    org.springframework.http.HttpStatus status = getStatus(request);
    logger.error("controller catch some error", ex);
    return new org.springframework.http.ResponseEntity<java.lang.Object>(new com.baifendian.swordfish.webserver.exception.CustomErrorType(NOT_MODIFIED, ex.getMessage()), NOT_MODIFIED);
}