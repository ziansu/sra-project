private void createJobInstances() {
    jobRepository.createJobInstance(JOB_NAME, com.marklogic.spring.batch.JobParametersTestUtils.getJobParameters());
    jobRepository.createJobInstance(JOB_NAME, com.marklogic.spring.batch.JobParametersTestUtils.getJobParameters());
    jobRepository.createJobInstance(JOB_NAME, com.marklogic.spring.batch.JobParametersTestUtils.getJobParameters());
    jobRepository.createJobInstance(((JOB_NAME) + "2"), com.marklogic.spring.batch.JobParametersTestUtils.getJobParameters());
}