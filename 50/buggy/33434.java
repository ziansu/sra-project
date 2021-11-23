@java.lang.Override
public boolean canParse(java.io.File f) {
    java.util.Map<java.lang.String, java.lang.String> map = getManifestContents(f);
    return (map != null) && (map.containsKey(Constants.BUNDLE_SYMBOLICNAME));
}