private org.springframework.http.ResponseEntity<java.lang.String> constructErrorResponse(java.lang.String errorMsg, org.springframework.http.HttpStatus status) {
    org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
    httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
    com.vip.saturn.job.console.domain.RestApiErrorResult restApiErrorResult = new com.vip.saturn.job.console.domain.RestApiErrorResult();
    restApiErrorResult.setMessage(errorMsg);
    return new org.springframework.http.ResponseEntity(com.alibaba.fastjson.JSON.toJSONString(restApiErrorResult), httpHeaders, status);
}