public boolean addStock(java.lang.String productId, int count) {
    boolean exist = false;
    if (project.Inventory.map.containsKey(productId)) {
        int stock = (project.Inventory.map.get(productId)) + count;
        project.Inventory.map.put(productId, stock);
        exist = true;
    }
    return exist;
}