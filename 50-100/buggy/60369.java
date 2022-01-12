com.puppycrawl.tools.checkstyle.checks.imports.AccessResult checkAccess(final java.lang.String forImport, final java.lang.String inPkg) {
    final com.puppycrawl.tools.checkstyle.checks.imports.AccessResult retVal = localCheckAccess(forImport, inPkg);
    if (retVal != (AccessResult.UNKNOWN)) {
        return retVal;
    }
    if ((parent) == null) {
        return AccessResult.DISALLOWED;
    }
    return parent.checkAccess(forImport, inPkg);
}