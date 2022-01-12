private java.lang.String readLine() throws java.io.IOException, java.lang.Exception {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    char ch = ((char) (in.read()));
    while (true) {
        sb.append(ch);
        if (ch == '\n') {
            java.lang.String line = sb.toString();
            handleString(line);
            return line;
        }
        ch = ((char) (in.read()));
    } 
}