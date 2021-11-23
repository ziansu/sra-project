@org.junit.Test
public void should_create_and_get_product() {
    java.lang.String id = productRepository.generateId();
    com.thoughtworks.api.domain.core.Product product = new com.thoughtworks.api.infrastructure.records.ProductRecord(id, "desk", "black", 530, 4);
    com.thoughtworks.api.domain.core.Product createdProduct = productRepository.create(product);
    org.hamcrest.MatcherAssert.assertThat(product, org.hamcrest.CoreMatchers.is(createdProduct));
}