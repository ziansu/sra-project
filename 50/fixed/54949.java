public boolean isHeaderShouldBeAppeneded(final java.lang.String fileName) {
    return (isFileShouldBeAddedWithHeader) || ((validFormat.contains("\\.")) && (validFormat.contains(fileName.split("\\.")[1])));
}