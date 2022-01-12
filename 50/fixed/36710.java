public io.elastest.etm.model.ElasEtmTjobexec executeTJob(java.lang.Long tJobId) {
    io.elastest.etm.model.ElasEtmTjob tjob = tJobRepo.findOne(tJobId);
    io.elastest.etm.model.ElasEtmTjobexec tJobExec = dockerExec.executeTJob(tjob);
    return tJobExec;
}