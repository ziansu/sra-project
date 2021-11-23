public org.everit.jira.analytics.PiwikUrlBuilder addCustomDimesionSearcherValue(final org.everit.jira.analytics.SearcherValue searcherValue) {
    parameters.add((((searcherValueParam) + "=") + (encodeParamValue(searcherValue.name()))));
    return this;
}