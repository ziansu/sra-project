public static org.eclipse.microprofile.jwt.credential.JWTCredential parse(java.lang.String authorizationHeader, org.eclipse.microprofile.jwt.principal.JWTAuthContextInfo authContextInfo) {
    org.eclipse.microprofile.jwt.credential.JWTCredential credential = null;
    if ((authorizationHeader != null) && (authorizationHeader.startsWith("Bearer "))) {
        java.lang.String token = authorizationHeader.substring(7);
        credential = new org.eclipse.microprofile.jwt.credential.JWTCredential(token);
    }
    return credential;
}