public static java.lang.String formatVersionDirectoryPart(final org.commonjava.maven.atlas.ident.ref.ProjectVersionRef ref) throws org.commonjava.maven.galley.TransferException {
    final org.commonjava.maven.atlas.ident.version.VersionSpec vs = ref.getVersionSpec();
    if (!(vs.isSingle())) {
        throw new org.commonjava.maven.galley.TransferException("Cannot format version directory part for: '%s'. Version is compound.", ref);
    }
    if (vs.isSnapshot()) {
        return (vs.getSingleVersion().getBaseVersion().renderStandard()) + "-SNAPSHOT";
    }else {
        return vs.renderStandard();
    }
}