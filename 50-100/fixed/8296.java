public synchronized java.util.List<java.lang.String> getJobConsole(final java.lang.String buildNumber, final java.lang.String jobName) {
    java.lang.String url = prepareUrl(jobName, buildNumber, "console");
    java.lang.String jjc = sendAndGetResponse(url, HttpMethod.GET, getHttpEntityWithHeaders()).getBody();
    return java.util.Arrays.asList(jjc.split("\\n"));
}