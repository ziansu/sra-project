@org.junit.Test
public void findAllTest() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Api> apis = apiRepository.findAll();
    assertNotNull(apis);
    assertFalse("Fail to resolve api in findAll", apis.isEmpty());
}