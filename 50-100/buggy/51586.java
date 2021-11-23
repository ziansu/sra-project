private java.util.List createList(int size) {
    java.util.List result = new java.util.ArrayList();
    for (int i = 1; i <= size; i++) {
        com.example.home.ShoppingItem.ShoppingItem ci = new com.example.home.ShoppingItem.ShoppingItem();
        ci.setName(("Shopping list " + i));
        if ((i % 2) == 0)
            ci.setChecked(true);
        else
            ci.setChecked(false);
        
        result.add(ci);
    }
    return result;
}