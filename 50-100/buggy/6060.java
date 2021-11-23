private java.lang.String parsePlayString(org.json.simple.JSONObject play) {
    java.lang.String value = ((java.lang.String) (play.get("value")));
    org.json.simple.JSONArray positions = ((org.json.simple.JSONArray) (play.get("position")));
    java.lang.String playString = (java.lang.String.valueOf(positions.get(0))) + " ";
    playString += (java.lang.String.valueOf(positions.get(1))) + " ";
    playString += value + "\n";
    return playString;
}