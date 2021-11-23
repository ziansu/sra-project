public T readXml() {
    if ((mDefaultResourceUrl) == null) {
        return null;
    }
    return readXml(mDefaultResourceUrl);
}