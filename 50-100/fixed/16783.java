@java.lang.Override
public boolean allows(com.intellij.openapi.vfs.VirtualFile file) {
    for (java.lang.String ignorePattern : ignorePatterns) {
        boolean matches = (file.getName().equals(ignorePattern)) || (java.util.regex.Pattern.compile(ignorePattern).matcher(file.getName()).matches());
        if (matches) {
            com.crownpartners.intellivault.filter.VaultImportFilter.log.info(java.lang.String.format("Skipping file %s, matched ignore pattern %s.", file.getCanonicalPath(), ignorePattern));
            return false;
        }
    }
    return true;
}