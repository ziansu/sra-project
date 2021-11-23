public com.allen.library.LayoutParams getParams(com.allen.library.LayoutParams params) {
    if (params == null) {
        params = new android.widget.LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    }
    return params;
}