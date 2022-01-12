@java.lang.Override
public com.nva.support.beans.product.ProductVO findByName(final com.nva.support.beans.product.ProductVO productVO) throws com.nva.support.exceptions.ServiceErrors {
    final com.nva.persistence.mongodb.entities.products.Product product = dozerConversion.map(productVO, com.nva.persistence.mongodb.entities.products.Product.class);
    final com.nva.persistence.mongodb.entities.products.Product productFromDb = productsRepository.findByName(product.getName());
    if (productFromDb == null) {
        throw new com.nva.support.exceptions.ServiceErrors();
    }
    return dozerConversion.map(productFromDb, com.nva.support.beans.product.ProductVO.class);
}