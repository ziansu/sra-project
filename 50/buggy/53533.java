public void setCancel() {
    setSrcColor(btnColor);
    if ((shakeAnimator) != null) {
        shakeAnimator.cancel();
    }
    isChecked = false;
}