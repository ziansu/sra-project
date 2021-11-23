private void setJobStatus(jobs.Job job, java.net.InetSocketAddress client, java.lang.String status) {
    int clientId = server.getDatabase().findClient(client);
    server.getClient(client).setAvailable(true);
    server.getDatabase().setJobStatus(job.getId(), jobs.JobSchedulingEvent.getStatusCode(status), clientId);
}