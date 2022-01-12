private java.util.List createList(int size) {
    java.util.List result = new java.util.ArrayList();
    for (int i = 1; i <= size; i++) {
        com.example.home.ShoppingItem.ShoppingItem ci = new com.example.home.ShoppingItem.ShoppingItem();
        ci.setName(("Shopping list " + i));
        ci.setChecked(false);
        result.add(ci);
    }
    return result;
}