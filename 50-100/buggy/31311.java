private boolean checkTimeFormat(org.json.simple.JSONArray data, java.lang.String curCol) {
    org.json.simple.JSONObject item = ((org.json.simple.JSONObject) (data.get(0)));
    java.lang.String curData = ((java.lang.String) (item.get(curCol)));
    java.lang.String signature = curData.replaceAll("[^-:TZ0-9]", "");
    if ((curData.length()) == (signature.length()))
        return true;
    
    return false;
}