public void appendText(java.lang.String str, boolean clearIfResult) {
    if (clearIfResult && ((mTextType) != (roottemplate.calculator.view.InputEditText.TextType.INPUT)))
        clearText();
    else
        setTextType(roottemplate.calculator.view.InputEditText.TextType.INPUT);
    
    int select = getSelectionStart();
    setText(getEditableText().insert(select, str));
    setSelection((select + (str.length())));
}