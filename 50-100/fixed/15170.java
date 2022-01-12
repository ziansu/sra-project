private static java.lang.String generateSecret() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (int i = 0; i < 32; i++) {
        builder.append(org.centauri.cloud.rest.jwt.JWTUtil.chars[((int) (java.lang.Math.round((((java.lang.Math.random()) * (org.centauri.cloud.rest.jwt.JWTUtil.chars.length)) - 1))))]);
    }
    return builder.toString();
}