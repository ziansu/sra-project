private org.springframework.http.ResponseEntity<com.victorku.musiccloud.web.model.ErrorResponseBody> getErrorResponseBody(com.victorku.musiccloud.exceptions.ApplicationErrorTypes errorType) {
    return new org.springframework.http.ResponseEntity(new com.victorku.musiccloud.web.model.ErrorResponseBody(errorType), org.springframework.http.HttpStatus.NOT_FOUND);
}