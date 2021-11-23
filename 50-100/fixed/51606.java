private void checkHeader(java.lang.String[] line) {
    java.lang.String[] headers;
    int end = 0;
    for (int i = 0; i < (line.length); i++) {
        if (line[i].isEmpty()) {
            break;
        }
        end++;
    }
    headers = new java.lang.String[end];
    java.lang.System.arraycopy(line, 0, headers, 0, end);
    org.intermine.bio.dataconversion.GenerifConverter.LOG.info(("WW header lenght " + (headers.length)));
}