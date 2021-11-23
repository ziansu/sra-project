@org.junit.Test
public void shouldFindAllApiMembers() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Set<io.gravitee.repository.management.model.Membership> memberships = membershipRepository.findByReferenceAndRole(MembershipReferenceType.API, "api1", null, null);
    assertNotNull("result must not be null", memberships);
    assertTrue((!(memberships.isEmpty())));
    assertEquals("user1", memberships.iterator().next().getUserId());
}