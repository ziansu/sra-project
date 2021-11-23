public static void alterElement(int id, double discount, int tax, double price) {
    io.altar.jseproject.repository.ProductRepository.productList.get(id).setDiscount(discount);
    io.altar.jseproject.repository.ProductRepository.productList.get(id).setTax(tax);
    io.altar.jseproject.repository.ProductRepository.productList.get(id).setSalePrice(price);
}