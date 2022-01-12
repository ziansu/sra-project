@org.junit.Test
public void shouldDelete() throws io.gravitee.repository.exceptions.TechnicalException {
    groupRepository.delete("group-api-to-delete");
    java.util.Optional<io.gravitee.repository.management.model.Group> group = groupRepository.findById("group-api-to-delete");
    assertNotNull(group);
    assertFalse(group.isPresent());
}