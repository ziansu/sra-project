public static boolean areOrgUnitsEqualOrParent(org.sigmah.server.domain.OrgUnit potentialChild, java.lang.Integer targetId) {
    if (potentialChild == null) {
        return false;
    }
    if (potentialChild.getId().equals(targetId)) {
        return true;
    }
    if ((potentialChild.getParentOrgUnit()) == null) {
        return false;
    }
    return org.sigmah.shared.util.OrgUnitUtils.areOrgUnitsEqualOrParent(potentialChild.getParentOrgUnit(), targetId);
}