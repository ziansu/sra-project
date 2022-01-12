public static android.net.Uri getYoutubeDeeplink(java.lang.String bookName, java.lang.String pageNumber) {
    if (edu.gatech.cats.svreading.Util.JSONUtils.isJSONFileLoad()) {
        try {
            org.json.JSONObject pages = edu.gatech.cats.svreading.Util.JSONUtils.Books.getJSONObject(bookName);
            java.lang.String link = pages.getString(pageNumber);
            return android.net.Uri.parse(((edu.gatech.cats.svreading.Util.JSONUtils.deepLink) + link));
        } catch (java.lang.Exception ex) {
            android.util.Log.e("JSONUtils", "Failed to get link for the given book and page number!");
            return null;
        }
    }else {
        return null;
    }
}