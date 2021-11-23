@java.lang.Override
public void setError(java.lang.CharSequence errorText) {
    tempErrorText = (errorText == null) ? null : errorText.toString();
    adjustBottomLines();
    postInvalidate();
}