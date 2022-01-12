private static java.lang.String removeSymbol(java.lang.String value) {
    int len = value.length();
    if (len > 0) {
        if ((value.charAt(0)) == (com.google.blockly.android.ui.fieldview.BasicFieldAngleView.DEGREE_SYMBOL)) {
            value = value.substring(1);
        }else
            if ((value.charAt((len - 1))) == (com.google.blockly.android.ui.fieldview.BasicFieldAngleView.DEGREE_SYMBOL)) {
                value = value.substring(0, (len - 1));
            }
        
    }
    return value;
}