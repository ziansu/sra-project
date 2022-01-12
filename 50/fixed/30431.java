@org.springframework.web.bind.annotation.GetMapping(value = "/jobdetails")
public java.util.List<com.example.model.JobInfo> jobDetails(java.lang.String userName, java.lang.String grpName, java.lang.String jobName, java.lang.String status) {
    return schedulerService.getJobDetails(userName, grpName, jobName, status);
}