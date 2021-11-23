public boolean addProducts(project.Product product, int count) {
    project.Inventory.proList.add(product);
    project.Inventory.map.put(product.getID(), count);
    return true;
}