private java.util.List<java.lang.String> populateItems() {
    java.util.List<java.lang.String> myList = new java.util.ArrayList<>();
    for (int i = 1; i <= 100; i++) {
        myList.add(("Item" + i));
    }
    return myList;
}