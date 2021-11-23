public static boolean isTextViewValid(android.widget.AutoCompleteTextView textView) {
    java.lang.String location = textView.getText().toString();
    if (location.isEmpty()) {
        textView.setError("Please Input an Airport Code");
        return false;
    }else
        if ((location.length()) != 3) {
            textView.setError("Please Input a 3 Character Airport Code");
            return false;
        }
    
    return true;
}