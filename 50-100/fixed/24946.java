private java.lang.String nextToken() throws java.io.IOException {
    while (((strtok) == null) || (!(strtok.hasMoreTokens()))) {
        strtok = new java.util.StringTokenizer(inr.readLine());
    } 
    return strtok.nextToken();
}