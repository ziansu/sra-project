protected void readInputLines(java.io.InputStream is) throws java.io.IOException {
    lines = new java.util.ArrayList<java.lang.String>();
    java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(is, "UTF-8"));
    java.lang.String line;
    while (((line = r.readLine()) != null) && (!(line.isEmpty()))) {
        lines.add(line);
    } 
}