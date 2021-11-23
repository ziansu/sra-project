public java.lang.String getContent() {
    java.lang.String content;
    try {
        content = ((java.lang.String) (this.jsonObject.get("content")));
        org.jsoup.nodes.Document jsoupDoc = org.jsoup.Jsoup.parse(content);
        content = jsoupDoc.toString();
    } catch (java.lang.Exception e) {
        android.util.Log.e("getContent_Error:", e.getMessage(), e);
        content = null;
    }
    return content;
}