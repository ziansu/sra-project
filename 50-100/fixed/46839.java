protected static java.lang.Boolean requestorHasRole(models.User requestor, models.Membership m, enums.MembershipRoles role) {
    if (m != null) {
        for (models.Role requestorRole : m.getRoles()) {
            if (requestorRole.getName().equals(role.toString())) {
                return true;
            }
        }
        return false;
    }else {
        return false;
    }
}