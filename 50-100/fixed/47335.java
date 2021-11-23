private void readStream(java.io.InputStream stream, boolean error) throws java.io.IOException {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(stream));
    java.lang.String inputLine;
    while ((inputLine = reader.readLine()) != null) {
        if (error) {
            ActiveMQUtilLogger.LOGGER.failedToReadFromStream(inputLine);
        }else {
            org.apache.activemq.artemis.core.server.NetworkHealthCheck.logger.trace(inputLine);
        }
    } 
    reader.close();
}