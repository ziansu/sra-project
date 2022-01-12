public void computeNonce() {
    nonce = java.lang.Long.toHexString(java.lang.Math.abs(((com.google.api.client.auth.oauth.OAuthParameters.RANDOM.nextLong()) >>> 1)));
}