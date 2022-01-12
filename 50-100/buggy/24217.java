@java.lang.Override
protected void onPostExecute(java.lang.String errorMessage) {
    feedbackView.setProgressBarVisibility(false);
    if (errorMessage != null) {
        android.util.Log.w(amai.org.conventions.events.activities.EventActivity.TAG, ("Failed to send feedback mail. Reason: " + errorMessage));
        android.widget.Toast.makeText(this, getString(R.string.feedback_send_mail_failed), Toast.LENGTH_LONG).show();
    }else {
        feedbackView.setEvent(conventionEvent);
    }
}