public com.investment.king.model.AddSecurityResponse getSecurity(java.lang.String id) {
    java.lang.String response = "Found";
    java.lang.String responseCode = "00";
    com.investment.king.model.Security s = getSingleSecurity(id);
    if (s == null) {
        response = "Not Found";
        responseCode = "00";
    }else
        if ((s.getId()) == (-1)) {
            response = "Application Error";
            responseCode = "-99";
        }
    
    return new com.investment.king.model.AddSecurityResponse(s, response, responseCode);
}