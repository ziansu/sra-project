public static void alterElement(java.lang.Integer id, java.lang.Integer discount, java.lang.Integer tax, java.lang.Double price) {
    io.altar.jseproject.repository.ProductRepository.productList.get(id).setDiscount(discount);
    io.altar.jseproject.repository.ProductRepository.productList.get(id).setTax(tax);
    io.altar.jseproject.repository.ProductRepository.productList.get(id).setSalePrice(price);
}