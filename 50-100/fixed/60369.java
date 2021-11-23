com.puppycrawl.tools.checkstyle.checks.imports.AccessResult checkAccess(final java.lang.String forImport, final java.lang.String inPkg) {
    com.puppycrawl.tools.checkstyle.checks.imports.AccessResult result;
    final com.puppycrawl.tools.checkstyle.checks.imports.AccessResult retVal = localCheckAccess(forImport, inPkg);
    if (retVal != (AccessResult.UNKNOWN)) {
        result = retVal;
    }else
        if ((parent) == null) {
            result = AccessResult.DISALLOWED;
        }else {
            result = parent.checkAccess(forImport, inPkg);
        }
    
    return result;
}