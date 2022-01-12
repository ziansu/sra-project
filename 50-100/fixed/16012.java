private java.lang.String getPlaceEntry(java.lang.String str, int pos) {
    java.lang.String[] strfield = str.split("\\s+");
    if ((strfield[(pos - 1)].equals("")) || (strfield[(pos - 1)].equals("AVO"))) {
        return "?";
    }
    return strfield[(pos - 1)];
}