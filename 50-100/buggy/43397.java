private java.lang.String readFromStream(java.io.InputStream iS) throws java.io.IOException {
    android.util.Log.i("In readFromStream", " method ;)");
    java.lang.StringBuilder outSB = new java.lang.StringBuilder();
    if (iS != null) {
        java.io.InputStreamReader iSReader = new java.io.InputStreamReader(iS, "UTF-8");
        java.io.BufferedReader reader = new java.io.BufferedReader(iSReader);
        java.lang.String line = reader.readLine();
        while (line != null) {
            outSB.append(line);
            line = reader.readLine();
        } 
    }
    return outSB.toString();
}