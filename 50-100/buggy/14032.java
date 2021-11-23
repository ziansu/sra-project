public void showSnackbarPopup(java.lang.String message, int seconds, int gravity) {
    android.widget.LinearLayout linearLayout = ((android.widget.LinearLayout) (findViewById(R.id.progress_page)));
    android.support.design.widget.Snackbar notice = android.support.design.widget.Snackbar.make(linearLayout, message, Snackbar.LENGTH_INDEFINITE);
    android.view.View errorNoticeView = notice.getView();
    android.widget.TextView textView = ((android.widget.TextView) (errorNoticeView.findViewById(android.support.design.R.id.snackbar_text)));
    textView.setMaxLines(6);
    notice.show();
}