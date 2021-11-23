private static java.util.List<nl.pdok.catalog.jobentry.JobEntry> parseStringToJobEntries(java.lang.String jsonString) {
    java.util.List<nl.pdok.catalog.jobentry.JobEntry> listJobEntries = new java.util.ArrayList<>();
    org.codehaus.jackson.map.ObjectMapper mapper = new org.codehaus.jackson.map.ObjectMapper();
    try {
        nl.pdok.catalog.jobentry.JobEntry[] entries = mapper.readValue(jsonString, nl.pdok.catalog.jobentry.JobEntry[].class);
        for (nl.pdok.catalog.jobentry.JobEntry entry : entries) {
            listJobEntries.add(entry);
        }
    } catch (java.io.IOException e) {
        nl.pdok.catalog.jobentry.JobEntriesReader.LOGGER.error("There was an error when attempting to parse the json file", e);
    }
    return listJobEntries;
}