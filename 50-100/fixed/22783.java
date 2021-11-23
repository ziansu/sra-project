private java.lang.String isGoogleSignIn(javax.servlet.http.HttpServletRequest req) {
    java.lang.String googleAuthCode = req.getParameter("googleAuthCode");
    if (googleAuthCode != null)
        return googleAuthCode;
    
    if ((req.getHeader("Authorization")) == null) {
        return null;
    }
    if (req.getHeader("Authorization").startsWith("BEARER ")) {
        return req.getHeader("Authorization").substring(7);
    }
    return null;
}