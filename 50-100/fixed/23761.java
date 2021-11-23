@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
@org.springframework.web.bind.annotation.ExceptionHandler(value = com.denimgroup.threadfix.exception.RestException.class)
@org.springframework.web.bind.annotation.ResponseBody
public com.denimgroup.threadfix.remote.response.RestResponse<java.lang.String> resolveRestException(com.denimgroup.threadfix.exception.RestException ex) {
    com.denimgroup.threadfix.data.entities.ExceptionLog exceptionLog = new com.denimgroup.threadfix.data.entities.ExceptionLog(ex);
    exceptionLogService.storeExceptionLog(exceptionLog);
    com.denimgroup.threadfix.webapp.controller.RestExceptionControllerAdvice.log.error((("Uncaught exception - logging at " + (com.denimgroup.threadfix.webapp.controller.RestExceptionControllerAdvice.format.format(exceptionLog.getTime().getTime()))) + "."));
    return com.denimgroup.threadfix.remote.response.RestResponse.failure(ex.getResponseString());
}