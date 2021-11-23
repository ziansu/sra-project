private static java.util.List<nl.pdok.catalog.jobentry.JobEntry> parseStringToJobEntries(java.lang.String jsonString) {
    org.codehaus.jackson.map.ObjectMapper mapper = new org.codehaus.jackson.map.ObjectMapper();
    try {
        nl.pdok.catalog.jobentry.JobEntry[] entries = mapper.readValue(jsonString, nl.pdok.catalog.jobentry.JobEntry[].class);
        return java.util.Arrays.asList(entries);
    } catch (java.io.IOException e) {
        nl.pdok.catalog.jobentry.JobEntriesReader.LOGGER.error("There was an error when attempting to parse the json file", e);
    }
    return new java.util.ArrayList<>();
}