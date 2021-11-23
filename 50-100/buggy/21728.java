public void output(final com.rometools.rome.feed.WireFeed feed, final java.io.File file, final boolean prettyPrint) throws com.rometools.rome.io.FeedException, java.io.IOException, java.lang.IllegalArgumentException {
    final java.io.Writer writer = new java.io.FileWriter(file);
    this.output(feed, writer, prettyPrint);
    writer.close();
}