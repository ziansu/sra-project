public java.util.ArrayList<com.example.user.finalproject.model.Category> getCategories() {
    com.example.user.finalproject.Server.ServerHelper.Response res = makeRequest(Constants.URL_CATEGORY_ALL, "GET", null);
    if ((res != null) && ((res.status) == 200)) {
        try {
            return com.example.user.finalproject.Server.ServerHelper.parseCategoryArray(new org.json.JSONArray(res.text));
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
    return null;
}