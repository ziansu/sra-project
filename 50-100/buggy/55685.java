private void checkFeed() {
    try {
        feed = new com.rometools.rome.io.SyndFeedInput().build(new com.rometools.rome.io.XmlReader(new java.net.URL(subscriptionUrl)));
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.RuntimeException();
    } catch (java.io.IOException | com.rometools.rome.io.FeedException e) {
        com.thatredhead.redbot.RedBot.reportError(e);
    }
}