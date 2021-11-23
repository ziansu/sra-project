private void cleanup(final eu.europeana.harvester.httpclient.response.HttpRetrieveResponse httpRetrieveResponse, final eu.europeana.harvester.cluster.domain.messages.RetrieveUrl task, final eu.europeana.harvester.cluster.slave.downloading.AsyncHttpClient asyncHttpClient, final java.lang.Throwable e) {
    if (httpRetrieveResponse != null)
        httpRetrieveResponse.setException(e);
    
    try {
        if (httpRetrieveResponse != null)
            httpRetrieveResponse.close();
        
    } catch (java.io.IOException e1) {
        LOG.error(eu.europeana.harvester.logging.LoggingComponent.appendAppFields(LoggingComponent.Slave.SLAVE_RETRIEVAL, task.getJobId(), task.getUrl(), task.getReferenceOwner()), "Failed to execute the final cleanup of the async downloader ", e1);
    }
}