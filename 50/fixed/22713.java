@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
@org.springframework.web.bind.annotation.ExceptionHandler(value = { java.lang.Exception.class })
public void handleException(java.lang.Exception e) throws java.lang.Exception {
    java.lang.System.out.println(e.getMessage());
    e.printStackTrace(java.lang.System.out);
    throw e;
}