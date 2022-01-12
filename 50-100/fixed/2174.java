public void numericButton(java.lang.String buttonName) {
    if (valueResetFlag) {
        inputValue = new java.lang.StringBuilder(buttonName);
        checkEqualSign();
        if (!(buttonName.equals(INITIAL_DISPLAYED_VALUE)))
            valueResetFlag = false;
        
    }else
        if (((inputValue.indexOf(".")) == (-1)) || (!(buttonName.equals("."))))
            inputValue.append(buttonName);
        
    
    if (historyResetFlag) {
        historyValue = new java.lang.StringBuilder();
    }
}