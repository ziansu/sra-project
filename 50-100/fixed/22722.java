public com.emc.storageos.vmax.restapi.model.AsyncJob getAsyncJob(java.lang.String jobId) throws java.lang.Exception {
    com.emc.storageos.vmax.restapi.VMAXApiClient.log.info("Get job {} status", jobId);
    com.sun.jersey.api.client.ClientResponse clientResponse = get(com.emc.storageos.vmax.VMAXConstants.getAsyncJobURI(jobId));
    com.emc.storageos.vmax.restapi.model.AsyncJob asyncJobResponse = getResponseObject(com.emc.storageos.vmax.restapi.model.AsyncJob.class, clientResponse);
    com.emc.storageos.vmax.restapi.VMAXApiClient.log.info("Successfully collected async job object");
    return asyncJobResponse;
}