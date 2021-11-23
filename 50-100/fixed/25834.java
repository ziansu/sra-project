private static java.lang.String removeQuotes(java.lang.String ssid) {
    if (ssid == null)
        return org.wahtod.wififixer.WFConnection.EMPTYSTRING;
    
    try {
        ssid = ((java.lang.String) (ssid.subSequence(1, ((ssid.length()) - 1))));
    } catch (java.lang.IndexOutOfBoundsException e) {
        return org.wahtod.wififixer.WFConnection.EMPTYSTRING;
    }
    return ssid;
}