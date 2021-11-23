private java.lang.String getPlaceEntry(java.lang.String str, int pos) {
    if ((str.equals("")) || (str.equals("AVO"))) {
        return "?";
    }
    java.lang.String[] strfield = str.split("\\s+");
    return strfield[(pos - 1)];
}