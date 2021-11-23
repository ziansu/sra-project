public java.util.ArrayList<com.example.aberchek.appenings.happening> buildHappeningArr() {
    if ((jsonArr) == null) {
        return null;
    }
    java.util.ArrayList<com.example.aberchek.appenings.happening> toReturn = new java.util.ArrayList<com.example.aberchek.appenings.happening>();
    for (int i = 0; i < (jsonArr.length()); ++i) {
        try {
            jsonObj = jsonArr.getJSONObject(i);
            toReturn.add(buildHappening());
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
    return toReturn;
}