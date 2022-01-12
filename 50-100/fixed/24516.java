public com.afollestad.materialdialogs.MaterialDialog.Builder inputRange(@android.support.annotation.IntRange(from = 0, to = java.lang.Integer.MAX_VALUE)
int minLength, @android.support.annotation.IntRange(from = -1, to = java.lang.Integer.MAX_VALUE)
int maxLength, @android.support.annotation.ColorInt
int errorColor) {
    if (minLength < 0)
        throw new java.lang.IllegalArgumentException("Min length for input dialogs cannot be less than 0.");
    
    this.inputMinLength = minLength;
    this.inputMaxLength = maxLength;
    if (errorColor == 0) {
        this.inputRangeErrorColor = com.afollestad.materialdialogs.util.DialogUtils.getColor(context, R.color.md_edittext_error);
    }else {
        this.inputRangeErrorColor = errorColor;
    }
    return this;
}