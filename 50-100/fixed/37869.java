@org.springframework.web.bind.annotation.GetMapping(value = "/entries/another-thread")
public org.springframework.http.ResponseEntity<java.util.List<java.lang.String>> callInAnotherThread(java.security.Principal principal) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    com.github.bilak.poc.hystrix_oauth2_feign.api.rest.SampleController.logger.debug("Principal from rest {}", principal);
    java.util.concurrent.Future<java.util.List<java.lang.String>> result = executor.submit(new com.github.bilak.poc.hystrix_oauth2_feign.api.rest.SampleController.SampleServiceClientCaller(sampleServiceClient));
    return java.util.Optional.ofNullable(result.get()).map(( r) -> org.springframework.http.ResponseEntity.ok(r)).orElse(new org.springframework.http.ResponseEntity<java.util.List<java.lang.String>>(org.springframework.http.HttpStatus.NOT_FOUND));
}