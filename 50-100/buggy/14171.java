public static java.lang.String Read(java.io.File file) {
    java.lang.StringBuilder text = new java.lang.StringBuilder();
    java.lang.String line = "";
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file));
        while ((line = br.readLine()) != null) {
            text.append(line);
            text.append('\n');
        } 
        br.close();
    } catch (java.io.IOException e) {
    }
    return text.toString();
}