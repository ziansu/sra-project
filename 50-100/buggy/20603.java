private void setBody(java.lang.String body, java.lang.Boolean isHTML, android.content.Intent draft) {
    if (isHTML) {
        draft.putExtra(Intent.EXTRA_TEXT, android.text.Html.fromHtml(body));
        draft.setType("text/html");
        if ((Build.VERSION.SDK_INT) > 15) {
            draft.putExtra(Intent.EXTRA_HTML_TEXT, body);
        }
    }else {
        draft.putExtra(Intent.EXTRA_TEXT, body);
        draft.setType("text/plain");
    }
}