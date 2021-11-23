@org.junit.Test
public void should_get_product_by_id() throws java.lang.Exception {
    java.lang.String id = productRepository.generateId();
    com.thoughtworks.api.domain.core.Product product = new com.thoughtworks.api.infrastructure.records.ProductRecord(id, "desk", "black", 530, 4);
    productRepository.create(product);
    final javax.ws.rs.core.Response get = get(("/products/" + id));
    org.hamcrest.MatcherAssert.assertThat(get.getStatus(), org.hamcrest.Matchers.is(201));
}