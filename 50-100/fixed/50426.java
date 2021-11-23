static java.lang.String generateRandomKey() {
    java.lang.String AB = "123456789ABCDEFGHIJKLMNOPKRSTUVWYZabcdefghijklmnopkrstuvwyz";
    java.security.SecureRandom rnd = new java.security.SecureRandom();
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < 16; i++) {
        sb.append(AB.charAt(rnd.nextInt(AB.length())));
    }
    return sb.toString();
}