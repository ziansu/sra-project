@org.junit.Test
public void shouldDelete() throws io.gravitee.repository.exceptions.TechnicalException {
    io.gravitee.repository.management.model.Membership membership = new io.gravitee.repository.management.model.Membership("userToDelete", "app1", io.gravitee.repository.management.model.MembershipReferenceType.APPLICATION);
    membershipRepository.delete(membership);
    java.util.Optional<io.gravitee.repository.management.model.Membership> optional = membershipRepository.findById("userToDelete", MembershipReferenceType.APPLICATION, "app1");
    org.junit.Assert.assertFalse("There is no membership", optional.isPresent());
}