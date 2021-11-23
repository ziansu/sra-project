private java.lang.String getExceptionMessage(java.lang.Throwable throwable, java.lang.Integer statusCode) {
    if (throwable != null) {
        return throwable.getMessage();
    }
    org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.valueOf(statusCode);
    return httpStatus.getReasonPhrase();
}