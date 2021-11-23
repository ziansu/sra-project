private org.springframework.http.ResponseEntity<java.lang.String> getSuccess(java.lang.String body, org.springframework.http.MediaType mediaType) {
    return new org.springframework.http.ResponseEntity(body, getHttpHeaders(mediaType), org.springframework.http.HttpStatus.OK);
}