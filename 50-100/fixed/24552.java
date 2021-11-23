private boolean isAllowedSignature(android.content.pm.PackageParser.Package pkg, java.lang.String permissionName) {
    for (android.content.pm.Signature pkgSig : pkg.mSignatures) {
        java.util.HashSet<java.lang.String> perms = mSignatureAllowances.get(pkgSig);
        if ((perms != null) && (perms.contains(permissionName))) {
            return true;
        }
    }
    return false;
}