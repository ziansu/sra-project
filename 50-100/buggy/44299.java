@org.junit.Test
public void shouldFindById() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Optional<io.gravitee.repository.management.model.Group> group = groupRepository.findById("group-application-1");
    org.junit.Assert.assertNotNull(group);
    org.junit.Assert.assertTrue(group.isPresent());
    org.junit.Assert.assertEquals("group-application-1", group.get().getId());
    org.junit.Assert.assertEquals(Group.Type.APPLICATION, group.get().getType());
    org.junit.Assert.assertEquals("group-application-1", group.get().getName());
}