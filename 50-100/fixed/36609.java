public static java.util.ArrayList<com.example.user.finalproject.model.News> parseNewsArray(org.json.JSONArray arr) {
    if (arr == null)
        return null;
    
    java.util.ArrayList<com.example.user.finalproject.model.News> newses = new java.util.ArrayList<>();
    for (int i = 0; i < (arr.length()); i++) {
        newses.add(com.example.user.finalproject.Server.ServerHelper.parseNews(arr.optJSONObject(i)));
    }
    return newses;
}