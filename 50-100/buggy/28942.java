private org.json.simple.JSONObject extract(java.lang.String response) {
    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    org.json.simple.JSONObject payload = null;
    try {
        payload = ((org.json.simple.JSONObject) (parser.parse(response)));
    } catch (org.json.simple.parser.ParseException e) {
        java.lang.System.out.println(((("Input file has JSON parse error: " + (e.getPosition())) + " ") + (e.toString())));
        java.lang.System.exit(4);
    }
    return payload;
}