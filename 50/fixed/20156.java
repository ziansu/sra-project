@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result != null) {
        mTextView.setText(result);
        mShowContentButton.setEnabled(true);
    }
}