@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    if ((resultBody) != null) {
        Body.setText(resultBody);
        Body.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        if (!(com.unit5app.Settings.getArticleSettingsBoolean(Settings.ID_ARTICLE_SETTING_SCROLL_WITH_TITLE))) {
            Body.setHorizontalScrollBarEnabled(true);
            Body.setVerticalScrollBarEnabled(true);
        }
        Body.setClickable(true);
        Body.setLinksClickable(true);
        Body.setTextIsSelectable(true);
    }
}