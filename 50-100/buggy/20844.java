public org.springframework.http.ResponseEntity<java.util.List<io.elastest.etm.api.model.TJob>> getAllTJobs() {
    java.util.List<io.elastest.etm.model.ElasEtmTjob> etmTjobList = tJobService.getAllTJobs();
    java.util.List<io.elastest.etm.api.model.TJob> tjobList = new java.util.ArrayList<>();
    for (io.elastest.etm.model.ElasEtmTjob elasEtmTjob : etmTjobList) {
        tjobList.add(dataConverter.etmTjobToApiTJob(elasEtmTjob));
        java.lang.System.out.println("asd");
    }
    return new org.springframework.http.ResponseEntity<java.util.List<io.elastest.etm.api.model.TJob>>(tjobList, org.springframework.http.HttpStatus.OK);
}