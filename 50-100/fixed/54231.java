private java.lang.String getJsonFromBody(api.HttpServletRequest request) throws java.io.IOException {
    java.lang.String jsonstr = null;
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.io.BufferedReader reader = request.getReader();
    try {
        java.lang.String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append('\n');
        } 
    } finally {
        reader.close();
    }
    jsonstr = sb.toString();
    return jsonstr;
}