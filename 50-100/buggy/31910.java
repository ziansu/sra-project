public boolean trashToken(java.lang.String token) {
    try {
        java.util.Map<java.lang.String, java.lang.Object> user = verify(token);
        if (cache.get(((TOKEN_PREFIX) + (user.get("uuid").toString()))).equals(token)) {
            cache.remove(((TOKEN_PREFIX) + (user.get("uuid").toString())));
        }else
            return false;
        
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}