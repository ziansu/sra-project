private java.lang.String getMissingClaims(java.util.Map<java.lang.String, java.lang.String> mappedAttrs, java.util.Map<java.lang.String, java.lang.String> mandatoryClaims) {
    java.lang.StringBuilder missingClaimsString = new java.lang.StringBuilder();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : mandatoryClaims.entrySet()) {
        if ((mappedAttrs.get(entry.getKey())) == null) {
            missingClaimsString.append(entry.getKey());
            missingClaimsString.append(",");
        }
    }
    return missingClaimsString.toString();
}