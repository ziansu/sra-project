private static java.lang.String removeQuotes(java.lang.String ssid) {
    if (ssid == null)
        return org.wahtod.wififixer.WFConnection.EMPTYSTRING;
    
    try {
        ssid = ((java.lang.String) (ssid.subSequence(1, ((ssid.length()) - 1))));
    } catch (java.lang.IndexOutOfBoundsException e) {
        if (org.wahtod.wififixer.WFConnection.prefs.getFlag(Pref.LOG_KEY))
            org.wahtod.wififixer.utility.LogService.log(org.wahtod.wififixer.WFConnection.ctxt, org.wahtod.wififixer.WFConnection.appname, org.wahtod.wififixer.WFConnection.ctxt.getString(R.string.indexoutofbounds_in_removequotes));
        
        return org.wahtod.wififixer.WFConnection.EMPTYSTRING;
    }
    return ssid;
}