private boolean displayInventory(java.util.ArrayList<Model.Item> items) {
    if (items.isEmpty()) {
        java.lang.System.out.println("You have no items!\n");
        return false;
    }
    for (int i = 0; i < (items.size()); i++) {
        java.lang.System.out.println((((i + ". ") + (items.get(i))) + "\n"));
    }
    return true;
}