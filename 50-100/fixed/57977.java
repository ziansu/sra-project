@java.lang.Override
public void run() {
    if ((query != null) && (!(query.isEmpty()))) {
        java.lang.String coloredText = com.owncloud.android.utils.StringUtils.searchAndColor(mOriginalText, query, getContext().getResources().getColor(R.color.primary));
        mTextPreview.setText(android.text.Html.fromHtml(coloredText.replace("\n", "<br \\>")));
    }else {
        mTextPreview.setText(mOriginalText);
    }
}