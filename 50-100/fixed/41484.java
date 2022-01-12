@java.lang.Override
protected void onPostExecute(final java.io.StringWriter stringWriter) {
    final android.widget.TextView textView = mTextViewReference.get();
    if (textView != null) {
        mOriginalText = stringWriter.toString();
        mSearchView.setOnQueryTextListener(this);
        textView.setText(mOriginalText);
        if (mSearchOpen) {
            mSearchView.setQuery(mSearchQuery, true);
        }
        textView.setVisibility(View.VISIBLE);
    }
    dismissLoadingDialog();
}