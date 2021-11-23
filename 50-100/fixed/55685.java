private void checkFeed() {
    try {
        feed = new com.rometools.rome.io.SyndFeedInput().build(new com.rometools.rome.io.XmlReader(new java.net.URL(subscriptionUrl)));
    } catch (java.net.MalformedURLException | com.rometools.rome.io.FeedException e) {
        throw new java.lang.RuntimeException();
    } catch (java.io.IOException e) {
        com.thatredhead.redbot.RedBot.reportError(e);
    }
}