public static java.lang.String readFileText(java.io.File file) throws java.io.IOException {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
    java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(file));
    java.lang.String s;
    while ((s = in.readLine()) != null) {
        if ((sb.length()) > 0) {
            sb.append('\n');
        }
        sb.append(s);
    } 
    return sb.toString();
}