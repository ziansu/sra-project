void verifyIssuer(final com.fasterxml.jackson.databind.JsonNode jwtClaims) throws com.auth0.jwt.JWTIssuerException {
    org.apache.commons.lang3.Validate.notNull(jwtClaims);
    if ((this.issuer) == null) {
        return ;
    }
    final java.lang.String issuerFromToken = (jwtClaims.has("iss")) ? jwtClaims.get("iss").asText() : null;
    if ((issuerFromToken == null) || (!(issuer.equals(issuerFromToken)))) {
        throw new com.auth0.jwt.JWTIssuerException("jwt issuer invalid", issuerFromToken);
    }
}