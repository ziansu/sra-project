public static boolean isTokenExpired(com.nimbusds.jwt.SignedJWT jwt) throws io.craigmiller160.orgbuilder.server.service.OrgApiSecurityException {
    boolean result = false;
    try {
        com.nimbusds.jwt.JWTClaimsSet claimsSet = jwt.getJWTClaimsSet();
        java.time.LocalDateTime expiration = io.craigmiller160.orgbuilder.server.util.LegacyDateConverter.convertDateToLocalDateTime(claimsSet.getExpirationTime());
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        result = (now.compareTo(expiration)) >= 0;
    } catch (java.text.ParseException ex) {
        throw new io.craigmiller160.orgbuilder.server.service.OrgApiSecurityException("Unable to validate JSON Web Token expiration", ex);
    }
    return result;
}