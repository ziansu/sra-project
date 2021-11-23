private java.lang.String readCommandOutput(java.lang.Process process) {
    java.lang.String s;
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    try {
        java.io.BufferedReader stdInput = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            sb.append(s);
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return sb.toString();
}