private void initialize() throws java.io.IOException {
    this.iterator = featureReader.iterator();
    if (iterator.hasNext()) {
        this.currentVariant = iterator.next();
        (this.currentKey)++;
    }
}