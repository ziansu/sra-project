private void setData(java.lang.String text) {
    tv_question_text.loadUrl("about:blank");
    tv_question.loadUrl("about:blank");
    tv_question.getSettings().setJavaScriptEnabled(true);
    android.webkit.WebSettings ws = tv_question.getSettings();
    ws.setDefaultFontSize(13);
    tv_question.loadDataWithBaseURL("", text, "text/html", "UTF-8", "");
}