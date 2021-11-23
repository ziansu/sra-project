public org.pojava.datetime.MutableString trim() {
    endIndex = lastNonWhiteSpacePlusOne();
    startIndex = firstNonWhiteSpace();
    return this;
}