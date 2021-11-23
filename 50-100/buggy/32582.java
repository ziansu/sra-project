public java.lang.String next() {
    while (((tokenizer) == null) || (!(tokenizer.hasMoreTokens()))) {
        try {
            tokenizer = new java.util.StringTokenizer(reader.readLine());
        } catch (IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    } 
    return tokenizer.nextToken();
}