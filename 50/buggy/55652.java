public void onClick(android.view.View v) {
    v.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK);
    dispatchTakePictureIntent();
}