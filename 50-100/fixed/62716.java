public static org.json.simple.JSONObject parseString(java.lang.String input) {
    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    org.json.simple.JSONObject resJson = null;
    try {
        resJson = ((org.json.simple.JSONObject) (parser.parse(input)));
    } catch (org.json.simple.parser.ParseException e) {
        java.lang.System.out.println("Error: Can't parse the response!");
        e.printStackTrace();
        java.lang.System.exit(1);
    }
    return resJson;
}