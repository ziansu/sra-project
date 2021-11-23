private static void parseLine(java.lang.String line) throws org.json.simple.parser.ParseException {
    java.lang.String[] objs = line.split(model.Input.missingNo);
    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    for (java.lang.String item : objs) {
        org.json.simple.JSONObject obj = ((org.json.simple.JSONObject) (parser.parse(item)));
        java.lang.System.out.println(obj);
        model.Input.model.updateProperties(obj);
    }
}