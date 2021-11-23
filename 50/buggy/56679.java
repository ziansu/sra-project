private java.io.BufferedReader getReader(jazmin.deploy.domain.MonitorInfoQuery query) throws java.io.IOException {
    java.io.File file = getReaderFile(query);
    return new java.io.BufferedReader(new java.io.FileReader(file));
}