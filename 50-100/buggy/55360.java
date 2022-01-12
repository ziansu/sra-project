@java.lang.Override
public void onTextChanged(android.widget.EditText view, java.lang.String text) {
    matchRegexPatternsWithText(text.replace(com.alihafizji.library.CreditCardEditText.SEPARATOR, ""));
    java.lang.String difference = com.alihafizji.library.StringUtil.difference(text, mPreviousText);
    if (!(difference.equals(com.alihafizji.library.CreditCardEditText.SEPARATOR))) {
        addSeparatorToText();
    }
    mPreviousText = text;
}