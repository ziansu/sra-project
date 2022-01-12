public void deleteProduct(java.lang.Long id) {
    java.util.Iterator<by.mashop.bean.Product> iterator = myProducts.iterator();
    while (iterator.hasNext()) {
        by.mashop.bean.Product p = iterator.next();
        if ((p.getId()) == id) {
            iterator.remove();
            break;
        }
    } 
}