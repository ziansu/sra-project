public java.util.HashSet<java.lang.String> getICDsBeforeATC(java.lang.String atcCode) {
    java.time.LocalDateTime atcTime = ATC_CODES.get(atcCode);
    java.util.HashSet<java.lang.String> icdBeforeATC = new java.util.HashSet<java.lang.String>();
    if (atcTime != null) {
        for (java.lang.String icdCode : ICD_CODES.keySet()) {
            if (ICD_CODES.get(icdCode).isAfter(atcTime))
                icdBeforeATC.add(icdCode);
            
        }
    }
    return icdBeforeATC;
}