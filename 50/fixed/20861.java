@org.junit.Test
public void findByIdMissingTest() throws java.lang.Exception {
    java.util.Optional<io.gravitee.repository.management.model.Api> optional = apiRepository.findById("findByNameMissing");
    assertFalse("Find api by name on missing api return a result", optional.isPresent());
}