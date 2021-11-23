private boolean accessControl(org.fenixedu.spaces.domain.Space space) {
    org.fenixedu.bennu.core.domain.User currentUser = org.fenixedu.bennu.core.security.Authenticate.getUser();
    if (space == null) {
        return org.fenixedu.bennu.core.groups.DynamicGroup.get("spaceSuperUsers").isMember(currentUser);
    }
    return space.isOccupationMember(currentUser);
}