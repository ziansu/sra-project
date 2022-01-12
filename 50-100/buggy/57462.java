private java.lang.String generateSessionToken() {
    java.lang.String token = "";
    java.util.Random random = new java.util.Random();
    java.lang.String validSymbols = "abcdefghijklmnopqrstuvwxyz0123456789";
    for (int token_symbol = 0; token_symbol < 64; token_symbol++) {
        token += validSymbols.charAt(random.nextInt(64));
    }
    return token;
}