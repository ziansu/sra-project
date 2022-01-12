private boolean isAllowedSignature(android.content.pm.PackageParser.Package pkg, java.lang.String permissionName) {
    for (android.content.pm.Signature pkgSig : pkg.mSignatures) {
        com.android.server.pm.HashSet<java.lang.String> perms = mSignatureAllowances.get(pkgSig);
        if ((perms != null) && (perms.contains(permissionName))) {
            return true;
        }
    }
    return false;
}