public java.util.List<com.qac.row5project.entities.Product> getProducts() {
    java.util.List<com.qac.row5project.entities.Product> returnable = new java.util.ArrayList<com.qac.row5project.entities.Product>();
    java.util.List<com.qac.row5project.entities.Product> stock = productManager.findAllProducts();
    java.util.Iterator i = stock.iterator();
    while (i.hasNext()) {
        com.qac.row5project.entities.Product p = ((com.qac.row5project.entities.Product) (i.next()));
        if ((p.getQuantity()) < 5) {
            returnable.add(p);
        }
    } 
    return returnable;
}