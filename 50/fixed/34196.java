public void setHelperText(java.lang.CharSequence helperText) {
    this.helperText = (helperText == null) ? null : helperText.toString();
    if (adjustBottomLines()) {
        postInvalidate();
    }
}