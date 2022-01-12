public boolean verifyAuthToken(java.lang.String token) {
    java.lang.String[] parts = org.rapidcontext.core.type.User.decodeAuthToken(token);
    long expiry = java.lang.Long.parseLong(parts[1]);
    boolean isExpired = expiry < (java.lang.System.currentTimeMillis());
    return ((isEnabled()) && (!isExpired)) && (createAuthToken(expiry).equals(token));
}