@org.junit.Test
public void shouldUpdate() throws io.gravitee.repository.exceptions.TechnicalException {
    io.gravitee.repository.management.model.Membership membership = new io.gravitee.repository.management.model.Membership("userToUpdate", "app1", io.gravitee.repository.management.model.MembershipReferenceType.APPLICATION);
    membership.setCreatedAt(new java.util.Date(0));
    io.gravitee.repository.management.model.Membership update = membershipRepository.update(membership);
    assertNotNull(update);
    assertEquals(new java.util.Date(0), update.getCreatedAt());
}