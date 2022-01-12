private java.lang.String readInput(java.io.InputStream is) throws java.io.IOException {
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(is, "UTF-8"));
    java.lang.String result = "";
    java.lang.String line;
    while ((line = br.readLine()) != null) {
        result += line + "\n";
    } 
    if (!(result.isEmpty())) {
        result = result.substring(0, result.lastIndexOf('\n'));
    }
    return result;
}