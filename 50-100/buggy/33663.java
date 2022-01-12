@java.lang.Override
public be.ehb.entities.organizations.MembershipBean createOrUpdateMembership(be.ehb.entities.organizations.MembershipBean membership) {
    be.ehb.entities.organizations.MembershipBean rval = null;
    be.ehb.entities.organizations.MembershipBean existing = findMembershipByUserAndOrganization(membership.getUserId(), membership.getOrganizationId());
    if (existing != null) {
        existing.setRoleId(membership.getRoleId());
        return updateMembership(membership);
    }else {
        return createMembership(membership);
    }
}