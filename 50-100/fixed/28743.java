protected java.lang.String currentCompletionText() {
    if (hintVisible)
        return "";
    
    android.text.Editable editable = com.tokenautocomplete.TokenCompleteTextView.getText();
    int end = getCorrectedTokenEnd();
    int start = getCorrectedTokenBeginning(end);
    return android.text.TextUtils.substring(editable, start, end).trim();
}