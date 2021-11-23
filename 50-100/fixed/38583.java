private java.lang.String stringFromInputStream() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(stream));
        sb.append(br.readLine());
    } catch (java.io.IOException e) {
        e.fillInStackTrace();
    }
    return sb.toString();
}