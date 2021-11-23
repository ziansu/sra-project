public static java.lang.String getHalIDFromHalDocID(java.lang.String halDocID) {
    int ind = halDocID.indexOf("v");
    java.lang.String halID = "";
    if (ind > (-1)) {
        halID = halDocID.substring(0, ind);
    }
    return halID;
}