@org.junit.Test
public void shouldFindApiOwner() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Set<io.gravitee.repository.management.model.Membership> memberships = membershipRepository.findByReferenceAndRole(MembershipReferenceType.API, "api1", RoleScope.API, "OWNER");
    org.junit.Assert.assertNotNull("result must not be null", memberships);
    org.junit.Assert.assertTrue((!(memberships.isEmpty())));
    org.junit.Assert.assertEquals("user1", memberships.iterator().next().getUserId());
}