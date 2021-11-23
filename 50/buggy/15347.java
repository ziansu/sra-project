public void setTypedText(java.lang.String typedText) {
    if (typedText.endsWith(mParkedText))
        mText = typedText;
    else
        mText = typedText + (mParkedText);
    
    observeText();
    textChanged();
}