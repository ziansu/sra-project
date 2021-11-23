public java.lang.String getTagNameCSV() {
    if (!(extracted)) {
        throw new java.lang.NullPointerException("Must run extract before extracting tags. ");
    }
    return tagNameCSV;
}