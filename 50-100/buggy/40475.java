@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((ratingBar) != null) {
        outState.putFloat(com.nearit.ui_bindings.feedback.NearItFeedbackFragment.SAVED_RATING, ratingBar.getRating());
    }
    if ((sendButton) != null) {
        outState.putBoolean(com.nearit.ui_bindings.feedback.NearItFeedbackFragment.SAVED_IS_BUTTON_CHECKED, sendButton.isChecked());
    }
    if ((errorText) != null) {
        outState.putBoolean(com.nearit.ui_bindings.feedback.NearItFeedbackFragment.SAVED_IS_ALERT_VISIBLE, errorText.isShown());
    }
}