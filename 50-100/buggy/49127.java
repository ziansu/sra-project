@org.springframework.web.bind.annotation.RequestMapping(value = "/{namespace}/jobs", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.String> create(@org.springframework.web.bind.annotation.PathVariable(value = "namespace")
java.lang.String namespace, @org.springframework.web.bind.annotation.RequestBody
java.util.Map<java.lang.String, java.lang.Object> reqParams) {
    try {
        com.vip.saturn.job.console.domain.JobConfig jobConfig = constructJobConfig(namespace, reqParams);
        jobOperationService.validateJobConfig(jobConfig);
        restApiService.createJob(namespace, jobConfig);
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.CREATED);
    } catch (java.lang.Exception e) {
        return constructOtherResponses(e);
    }
}