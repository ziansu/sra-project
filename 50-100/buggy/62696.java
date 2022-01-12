public static java.lang.String toLowerCase(java.lang.String headerName) {
    java.lang.String lowerCase = ((java.lang.String) (gov.nist.javax.sip.header.SIPHeaderNamesCache.lowercaseMap.get(headerName)));
    if (lowerCase == null) {
        return headerName.toLowerCase().intern();
    }else {
        return lowerCase;
    }
}