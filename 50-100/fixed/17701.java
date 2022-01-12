@org.junit.Test
public void shouldFindByUserAndReferenceType() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Set<io.gravitee.repository.management.model.Membership> memberships = membershipRepository.findByUserAndReferenceType("user1", MembershipReferenceType.API);
    assertNotNull("result must not be null", memberships);
    assertTrue((!(memberships.isEmpty())));
    assertEquals("api1", memberships.iterator().next().getReferenceId());
}