public java.util.ArrayList<com.example.user.finalproject.model.Category> getCategories() {
    com.example.user.finalproject.Server.ServerHelper.Response res = makeRequest(Constants.URL_CATEGORY_ALL, "GET", null);
    java.lang.System.out.println(("status: " + (res.status)));
    java.lang.System.out.println(("text: " + (res.text)));
    if ((res.status) == 200) {
        try {
            return com.example.user.finalproject.Server.ServerHelper.parseCategoryArray(new org.json.JSONArray(res.text));
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
    return null;
}