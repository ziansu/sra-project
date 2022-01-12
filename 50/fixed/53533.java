public void setCancel() {
    setSrcColor(btnColor);
    if ((shakeAnimator) != null) {
        shakeAnimator.end();
        shakeAnimator.cancel();
    }
    isChecked = false;
}