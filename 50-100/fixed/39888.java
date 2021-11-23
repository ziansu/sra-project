@java.lang.Override
public com.nva.support.beans.product.ProductVO findByName(final com.nva.support.beans.product.ProductVO productVO) {
    final com.nva.persistence.mongodb.entities.products.Product product = dozerConversion.map(productVO, com.nva.persistence.mongodb.entities.products.Product.class);
    final com.nva.persistence.mongodb.entities.products.Product productFromDb = productsRepository.findByName(product.getName());
    if (productFromDb == null) {
        return null;
    }
    return dozerConversion.map(productFromDb, com.nva.support.beans.product.ProductVO.class);
}