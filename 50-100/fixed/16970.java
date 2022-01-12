private void writeToCheckOutTextArea() {
    java.lang.String info = "";
    for (InventoryItem item : library) {
        if (item.isCheckedOut()) {
            info += (((((item.getName()) + "(") + (item.getType())) + ") is checked out with the due date of ") + (item.getDueDate())) + "\n";
        }
    }
    checkedOutTextArea.setText(info);
}