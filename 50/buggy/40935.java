@org.junit.Test
public void shouldGetByProductId() throws java.lang.Exception {
    repository.getByProductId(1L);
    org.mockito.Mockito.verify(mapper.getByProductId(1L));
}