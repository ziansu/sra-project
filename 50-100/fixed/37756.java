private void cleanup(final eu.europeana.harvester.httpclient.response.HttpRetrieveResponse httpRetrieveResponse, final eu.europeana.harvester.cluster.slave.downloading.AsyncHttpClient asyncHttpClient, final java.lang.Throwable e) {
    if (httpRetrieveResponse != null)
        httpRetrieveResponse.setException(e);
    
    try {
        if (httpRetrieveResponse != null)
            httpRetrieveResponse.close();
        
    } catch (java.io.IOException e1) {
        LOG.error(("Failed to close the response, caused by : " + (e1.getMessage())));
    }
}