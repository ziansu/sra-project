@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    textView = ((android.widget.TextView) (findViewById(R.id.loading_button_text)));
    loadingView = ((android.widget.ProgressBar) (findViewById(R.id.loading_button_spinner)));
    textView.setText(defaultText);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        loadingView.setIndeterminateTintList(new android.content.res.ColorStateList(new int[][]{ new int[]{  } }, new int[]{ loadingColor }));
    }
}