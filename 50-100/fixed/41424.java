public void setMemoryFieldText(java.lang.String text) {
    java.lang.String memorySize;
    if ((text.length()) == 0) {
        memorySize = "0";
    }else
        if ((text.length()) > 9) {
            memorySize = text.substring(0, 9);
        }else {
            memorySize = text;
        }
    
    memoryTextField.setText(memorySize);
}