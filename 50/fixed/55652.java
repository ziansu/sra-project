public void onClick(android.view.View v) {
    dispatchTakePictureIntent();
    v.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK);
}