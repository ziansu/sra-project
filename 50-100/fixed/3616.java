private java.util.Optional<java.net.URL> getXMLUrl(final java.lang.String aUrl) {
    final java.util.Optional<java.lang.Integer> id = getIdFromUrl(aUrl);
    if (id.isPresent()) {
        try {
            return java.util.Optional.of(new java.net.URL(java.lang.String.format(de.mediathekview.mserver.crawler.dreisat.tasks.DreisatFilmDetailsTask.XML_SERVICE_URL_PATTERN, id.get())));
        } catch (final java.net.MalformedURLException malformedURLException) {
            de.mediathekview.mserver.crawler.dreisat.tasks.DreisatFilmDetailsTask.LOG.fatal("Something went terrible wrong on getting the film details for 3Sat.", malformedURLException);
            crawler.incrementAndGetErrorCount();
            crawler.printErrorMessage();
        }
    }
    return java.util.Optional.empty();
}