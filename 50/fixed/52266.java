private void setupText() {
    mTextViewAbout.setText(android.text.Html.fromHtml(getString(R.string.about)));
    mTextViewAbout.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
}