public java.lang.String primaryLocation(java.lang.String location) {
    int newStringLength = (location.indexOf("of")) + 3;
    return location.substring(newStringLength);
}