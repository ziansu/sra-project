@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
org.springframework.http.ResponseEntity<org.springframework.hateoas.VndErrors> genericException(java.lang.Exception e) {
    return errorResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR, e.getClass().toString());
}