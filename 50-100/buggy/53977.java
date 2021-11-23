public org.springframework.http.HttpHeaders addTokenToHeaderCookie(java.lang.String token) {
    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
    headers.add("Set-Cookie", (((((((tokenHeader) + "=") + token) + "; Path=/") + "; Expires=") + (jwtTokenUtil.getExpirationDateFromToken(token))) + "; HttpOnly;"));
    return headers;
}