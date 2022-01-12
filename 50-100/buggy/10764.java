public org.apache.jackrabbit.core.security.authorization.AbstractCompiledPermissions.Result combine(org.apache.jackrabbit.core.security.authorization.AbstractCompiledPermissions.Result other) {
    int cAllows = (allows) | (org.apache.jackrabbit.core.security.authorization.Permission.diff(other.allows, denies));
    int cDenies = (denies) | (org.apache.jackrabbit.core.security.authorization.Permission.diff(other.denies, allows));
    org.apache.jackrabbit.core.security.authorization.PrivilegeBits cAPrivs = org.apache.jackrabbit.core.security.authorization.PrivilegeBits.getInstance(allowPrivileges);
    cAPrivs.addDifference(other.allowPrivileges, denyPrivileges);
    org.apache.jackrabbit.core.security.authorization.PrivilegeBits cdPrivs = org.apache.jackrabbit.core.security.authorization.PrivilegeBits.getInstance(denyPrivileges);
    cdPrivs.addDifference(other.denyPrivileges, allowPrivileges);
    return new org.apache.jackrabbit.core.security.authorization.AbstractCompiledPermissions.Result(cAllows, cDenies, allowPrivileges, denyPrivileges);
}