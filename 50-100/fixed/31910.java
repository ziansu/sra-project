public boolean trashToken(java.lang.String token) {
    try {
        java.util.Map<java.lang.String, java.lang.Object> user = verify(token);
        if (user != null) {
            cache.remove(((TOKEN_PREFIX) + (user.get("uuid").toString())));
            return true;
        }
        return false;
    } catch (java.lang.Exception e) {
        return false;
    }
}