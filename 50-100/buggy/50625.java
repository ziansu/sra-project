public com.investment.king.model.AddSecurityResponse getSecurity(java.lang.String id) {
    com.investment.king.model.AddSecurityResponse asr = null;
    java.lang.String response = "Found";
    java.lang.String responseCode = "00";
    com.investment.king.model.Security s = getSingleSecurity(id);
    if (s == null) {
        response = "Not Found";
        responseCode = "00";
        asr = new com.investment.king.model.AddSecurityResponse(s, response, responseCode);
    }else
        if ((s.getId()) == (-1)) {
            asr = new com.investment.king.model.AddSecurityResponse(s, "Application Error", "-99");
        }
    
    return asr;
}