protected void onNoNewTweets(@android.support.annotation.StringRes
int messageId) {
    android.support.design.widget.Snackbar.make(coordinatorLayout, messageId, Snackbar.LENGTH_SHORT).show();
}