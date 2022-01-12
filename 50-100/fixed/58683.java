private void closeConnection(java.net.HttpURLConnection connection) throws java.io.IOException {
    connection.getOutputStream().close();
    if ((connection.getResponseCode()) != 200) {
        org.elasticsearch.metrics.ElasticsearchReporter.LOGGER.error("Reporting returned code {} {}: {}", connection.getResponseCode(), connection.getResponseMessage());
    }
    connection.disconnect();
}