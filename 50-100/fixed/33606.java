private void loadTokenConfig(java.lang.String tokenFile) throws java.io.IOException {
    java.io.File tokenFileStream = new java.io.File(tokenFile);
    java.util.Scanner tokenScanner = new java.util.Scanner(tokenFileStream);
    while (tokenScanner.hasNextLine()) {
        java.lang.String input = tokenScanner.nextLine();
        java.util.StringTokenizer tokenized = new java.util.StringTokenizer(input, "=");
        tokens.put(tokenized.nextToken(), tokenized.nextToken());
    } 
}