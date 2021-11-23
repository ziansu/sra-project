private static java.util.List<be.ehb.factories.MembershipResponse> createMembershipResponses(java.util.List<be.ehb.entities.organizations.MembershipBean> memberships) {
    java.util.List<be.ehb.factories.MembershipResponse> rval = null;
    if (memberships != null) {
        rval = memberships.stream().map(be.ehb.factories.ResponseFactory::createMembershipResponse).collect(java.util.stream.Collectors.toList());
    }
    return rval;
}