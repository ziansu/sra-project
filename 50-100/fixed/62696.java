public static java.lang.String toLowerCase(java.lang.String headerName) {
    java.lang.String lowerCase = ((java.lang.String) (gov.nist.javax.sip.header.SIPHeaderNamesCache.lowercaseMap.get(headerName)));
    if (lowerCase == null) {
        lowerCase = headerName.toLowerCase().intern();
        gov.nist.javax.sip.header.SIPHeaderNamesCache.lowercaseMap.put(headerName, lowerCase);
        gov.nist.javax.sip.header.SIPHeaderNamesCache.lowercaseMap.put(lowerCase, lowerCase);
        return lowerCase;
    }else {
        return lowerCase;
    }
}