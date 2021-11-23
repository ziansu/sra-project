private org.sigmah.shared.dto.referential.PrivacyGroupPermissionEnum getPermission() {
    if (getOrgUnitIds().contains(null)) {
        return org.sigmah.shared.dto.referential.PrivacyGroupPermissionEnum.WRITE;
    }
    org.sigmah.shared.dto.referential.PrivacyGroupPermissionEnum permission = org.sigmah.shared.dto.referential.PrivacyGroupPermissionEnum.NONE;
    for (java.lang.Integer orgUnitId : getOrgUnitIds()) {
        org.sigmah.shared.dto.referential.PrivacyGroupPermissionEnum privacyGroupPermission = org.sigmah.shared.util.ProfileUtils.getPermissionForOrgUnit(auth(), orgUnitId, getPrivacyGroup());
        switch (privacyGroupPermission) {
            case NONE :
                break;
            case READ :
                permission = org.sigmah.shared.dto.referential.PrivacyGroupPermissionEnum.READ;
                break;
            case WRITE :
                return org.sigmah.shared.dto.referential.PrivacyGroupPermissionEnum.WRITE;
            default :
                throw new java.lang.IllegalStateException(("Unknown PrivacyGroupPermissionEnum : " + privacyGroupPermission));
        }
    }
    return permission;
}