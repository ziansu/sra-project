@java.lang.Override
public com.acme.ecommerce.domain.Purchase findById(java.lang.Long id) {
    com.acme.ecommerce.domain.Purchase result = repository.findOne(id);
    if (result == null) {
        throw new com.acme.ecommerce.web.exceptions.ProductIdNotFoundException();
    }
    return result;
}