private void btNumberOnClick(java.lang.String num) {
    if (strInput.endsWith("=")) {
        strInput = "";
        expressionTextView.setText(strInput);
        inputItems.clear();
        result = "";
    }
    if (currentItem.equals("0"))
        currentItem = num;
    else
        if (currentItem.equals("-0"))
            currentItem = "-" + num;
        else
            currentItem += num;
        
    
    isItemUpdated = true;
    updateItem();
}