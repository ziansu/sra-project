public boolean isValidToken(java.lang.String token) {
    java.lang.System.out.println(("TOken" + token));
    if ((token == null) || ((token.length()) == 0)) {
        return false;
    }
    try {
        return io.jsonwebtoken.Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody().getSubject().equals(Constants.BASIC_AUTH);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
}