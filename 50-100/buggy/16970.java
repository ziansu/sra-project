private void writeToCheckOutTextArea() {
    java.lang.String info = "";
    for (InventoryItem i : library) {
        if (i.isCheckedOut()) {
            info += (((((i.getName()) + "(") + (i.getType())) + ") is checked out with the due date of ") + (i.getDueDate())) + "\n";
        }
    }
    checkedOutTextArea.setText(info);
}