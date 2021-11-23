private java.lang.String stringFromInputStream() {
    java.io.BufferedReader br = null;
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    try {
        br = new java.io.BufferedReader(new java.io.InputStreamReader(stream));
        sb.append(br.readLine());
    } catch (java.io.IOException e) {
        e.fillInStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (java.io.IOException e) {
                e.fillInStackTrace();
            }
        }
    }
    return sb.toString();
}