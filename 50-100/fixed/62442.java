public static android.net.Uri getYoutubeDeeplink(java.lang.String bookName, java.lang.String pageNumber) {
    if (edu.gatech.cats.svreading.Util.JSONUtils.isJSONFileLoad()) {
        try {
            org.json.JSONObject pages = edu.gatech.cats.svreading.Util.JSONUtils.Books.getJSONObject(bookName);
            if ((pages.getString(pageNumber)) != null)
                return android.net.Uri.parse(((edu.gatech.cats.svreading.Util.JSONUtils.deepLink) + (pages.getString(pageNumber))));
            
        } catch (java.lang.Exception ex) {
            android.util.Log.e("JSONUtils", "Failed to get link for the given book and page number!");
            return null;
        }
    }else {
        return null;
    }
}