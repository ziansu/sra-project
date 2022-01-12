private boolean verifyRSAToken(java.lang.String token, java.lang.String algorithmCode, java.lang.String[] pemKeys) {
    for (java.lang.String pemKey : pemKeys) {
        try {
            com.auth0.jwt.algorithms.Algorithm algorithm = pl.surreal.finance.transaction.auth.SignAlgorithm.getAlgorithm(algorithmCode, pemKey, null).orElseThrow(() -> new java.lang.Exception("can't obtain algorithm"));
            com.auth0.jwt.JWT.require(algorithm).build().verify(token);
            return true;
        } catch (java.lang.Exception e) {
            pl.surreal.finance.transaction.auth.AuthTokenAuthenticator.LOGGER.debug("verifyRSAToken unable to verify token due to '{}'", e.getMessage());
            continue;
        }
    }
    return false;
}