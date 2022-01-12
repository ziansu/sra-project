@org.junit.Test
public void deleteApiTest() throws java.lang.Exception {
    java.util.Optional<io.gravitee.repository.management.model.Api> api = apiRepository.findById("api-to-delete");
    assertTrue("api exists", api.isPresent());
    apiRepository.delete("api-to-delete");
    api = apiRepository.findById("api-to-delete");
    assertFalse("api was deleted", api.isPresent());
}