private void addFirstElement(java.lang.String value) {
    hashTable.List.ListElement newElement = new hashTable.List.ListElement(value, null, null);
    head = newElement;
    tail = newElement;
    count = 1;
}