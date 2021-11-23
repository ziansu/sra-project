@java.lang.Override
public com.acme.ecommerce.domain.Purchase findById(java.lang.Long id) {
    com.acme.ecommerce.domain.Purchase result = repository.findOne(id);
    return result;
}