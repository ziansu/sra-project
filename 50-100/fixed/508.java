public static java.lang.String getHalIDFromHalDocID(java.lang.String halDocID) {
    if ((halDocID == null) || ((halDocID.length()) == 0))
        return "";
    
    int ind = halDocID.indexOf("v");
    if (ind != (-1)) {
        return halDocID.substring(0, ind);
    }else
        return halDocID;
    
}