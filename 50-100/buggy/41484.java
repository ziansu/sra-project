@java.lang.Override
protected void onPostExecute(final java.io.StringWriter stringWriter) {
    final android.widget.TextView textView = mTextViewReference.get();
    if (textView != null) {
        mOriginalText = new java.lang.String(stringWriter.getBuffer());
        mSearchView.setOnQueryTextListener(this);
        textView.setText(mOriginalText);
        if (((mSearchQuery) != null) && (mSearchOpen)) {
            mSearchView.setQuery(mSearchQuery, true);
        }
        textView.setVisibility(View.VISIBLE);
    }
    dismissLoadingDialog();
}