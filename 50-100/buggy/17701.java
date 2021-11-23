@org.junit.Test
public void shouldFindByUserAndReferenceType() throws io.gravitee.repository.exceptions.TechnicalException {
    java.util.Set<io.gravitee.repository.management.model.Membership> memberships = membershipRepository.findByUserAndReferenceType("user1", MembershipReferenceType.API);
    org.junit.Assert.assertNotNull("result must not be null", memberships);
    org.junit.Assert.assertTrue((!(memberships.isEmpty())));
    org.junit.Assert.assertEquals("api1", memberships.iterator().next().getReferenceId());
}