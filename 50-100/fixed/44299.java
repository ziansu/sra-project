@org.junit.Test
public void shouldFindById() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Optional<io.gravitee.repository.management.model.Group> group = groupRepository.findById("group-application-1");
    assertNotNull(group);
    assertTrue(group.isPresent());
    assertEquals("group-application-1", group.get().getId());
    assertEquals("group-application-1", group.get().getName());
}