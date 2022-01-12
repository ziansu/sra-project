public void deleteProduct(long itemID, int productLinker) {
    orderDao.deleteOrdersByProductID(itemID);
    productDao.deleteDecoratedProduct(productLinker);
}