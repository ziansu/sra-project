public com.rometools.rome.feed.WireFeed build(final java.io.File file) throws com.rometools.rome.io.FeedException, java.io.FileNotFoundException, java.io.IOException, java.lang.IllegalArgumentException {
    com.rometools.rome.feed.WireFeed feed;
    java.io.Reader reader = new java.io.FileReader(file);
    try {
        if (xmlHealerOn) {
            reader = new com.rometools.rome.io.impl.XmlFixerReader(reader);
        }
        feed = this.build(reader);
    } finally {
        reader.close();
    }
    return feed;
}