public void onCompleted(com.facebook.GraphResponse response) {
    java.lang.System.out.println(response.toString());
    try {
        org.json.JSONArray rawName = response.getJSONObject().getJSONArray("data");
        java.lang.System.out.println(rawName.length());
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}