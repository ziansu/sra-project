public java.lang.String getNextResultURL(javax.servlet.http.HttpServletRequest request, java.util.List<org.freeshr.events.EncounterEvent> requestResults, java.util.Date requestedDate) throws java.io.UnsupportedEncodingException, java.net.URISyntaxException {
    int size = requestResults.size();
    if (size <= 0) {
        return rollingFeedUrl(request, requestedDate);
    }
    org.freeshr.events.EncounterEvent lastEncounterEvent = requestResults.get((size - 1));
    return org.freeshr.utils.UrlUtil.addLastUpdatedQueryParams(request, lastEncounterEvent.getCreatedAt(), lastEncounterEvent.getId());
}