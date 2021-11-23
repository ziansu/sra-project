public at.ac.tuwien.big.we16.ue3.model.Product getProductById(long id) throws at.ac.tuwien.big.we16.ue3.exception.ProductNotFoundException {
    at.ac.tuwien.big.we16.ue3.model.Product product = at.ac.tuwien.big.we16.ue3.service.ProductService.em.find(at.ac.tuwien.big.we16.ue3.model.Product.class, id);
    return product;
}