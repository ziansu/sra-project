public website.frontrow.level.Level parseMap(java.io.InputStream stream) throws java.io.IOException {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(stream));
    int len = -1;
    java.lang.String line;
    java.util.ArrayList<java.lang.String> lines = new java.util.ArrayList<java.lang.String>();
    while ((line = reader.readLine()) != null) {
        lines.add(line);
    } 
    return parseMap(lines.toArray(new java.lang.String[lines.size()]));
}