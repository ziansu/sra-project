private java.lang.String removeSymbol(java.lang.String string) {
    int len = string.length();
    if (len > 0) {
        if ((string.charAt((len - 1))) == (com.google.blockly.android.ui.fieldview.BasicFieldAngleView.DEGREE_SYMBOL)) {
            string = string.substring(0, (len - 1));
        }else
            if ((string.charAt(0)) == (com.google.blockly.android.ui.fieldview.BasicFieldAngleView.DEGREE_SYMBOL)) {
                string = string.substring(1);
            }
        
    }
    return string;
}