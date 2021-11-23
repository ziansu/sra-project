public void setCount(int count) {
    mCount = count;
    mCountView.setText(getResources().getString(mCountFormatResId, new java.lang.Object[]{ java.lang.Integer.valueOf(count) }));
}