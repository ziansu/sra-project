public java.util.Set<java.lang.String> getTagNameSet() {
    if (!(extracted)) {
        throw new java.lang.NullPointerException("Must run extract before extracting tags. ");
    }
    return tagNameSet;
}