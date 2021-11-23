@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.RuntimeException.class)
org.springframework.http.ResponseEntity<org.springframework.hateoas.VndErrors> genericException(java.lang.RuntimeException e) {
    return errorResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR, e.getClass().toString());
}