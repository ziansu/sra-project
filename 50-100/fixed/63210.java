public void setDisabledItems(java.util.ArrayList<T> items) {
    disabledItems = new java.util.HashSet<>();
    for (int i = 0; i < (items.size()); i++) {
        disabledItems.add(items.get(i));
    }
    java.lang.System.out.println(("disabledItems : " + (disabledItems)));
}