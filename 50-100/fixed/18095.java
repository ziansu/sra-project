@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
@org.springframework.web.bind.annotation.ResponseBody
public com.outwit.edoctor.infrastructure.Term.Interaction errorHandler(java.lang.Throwable ex) {
    com.outwit.edoctor.infrastructure.exception.ApplicationException applicationException = null;
    if (ex instanceof com.outwit.edoctor.infrastructure.exception.ApplicationException) {
        applicationException = ((com.outwit.edoctor.infrastructure.exception.ApplicationException) (ex));
    }else {
        applicationException = new com.outwit.edoctor.infrastructure.exception.ApplicationException(ex.getMessage(), ex, SystemCode.INTERNAL_ERROR);
    }
    log.info(applicationException.getMessage());
    return new com.outwit.edoctor.infrastructure.Term.Interaction(applicationException.getStatusCode(), messageSource.getMessage(java.lang.String.valueOf(applicationException.getStatusCode()), null, null));
}