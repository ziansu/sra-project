@java.lang.Override
public void ingest(no.difi.statistics.ingest.client.model.TimeSeriesDefinition seriesDefinition, java.util.List<no.difi.statistics.ingest.client.model.TimeSeriesPoint> dataPoints) {
    try {
        java.net.HttpURLConnection connection = getConnection(postUrlFor(seriesDefinition), "POST");
        writeJsonListToOutputStream(dataPoints, connection);
        handleResponse(connection.getResponseCode());
    } catch (java.io.IOException e) {
        throw new no.difi.statistics.ingest.client.ConnectFailed(e);
    }
}