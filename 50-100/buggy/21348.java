private java.util.List<java.lang.String> populateItems() {
    java.util.List<java.lang.String> myList = java.util.Collections.emptyList();
    for (int i = 1; i <= 100; i++) {
        myList.add(("Item" + i));
    }
    return null;
}