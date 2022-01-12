public void handleColumnTypeDrowDown() {
    java.lang.String selectedItem = columnType.getSelectedItem().toString();
    if ((selectedItem.equals("Date")) && (!(comboValue.toLowerCase().equals("date")))) {
        addTheDateTypeElement(selectedItem);
    }else
        if ((selectedItem.equals("Int")) || ((selectedItem.equals("String")) && (comboValue.toLowerCase().equals("date")))) {
            removeTheDateTypeElement(selectedItem);
        }
    
}