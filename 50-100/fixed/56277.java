@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    int textLength = editText.getText().length();
    if (textLength >= (minChars)) {
        currentState = getCurrentState(textLength);
        updateContentWithState(textLength);
    }else {
        fillViewsWithContent(textLength, minChars);
    }
}