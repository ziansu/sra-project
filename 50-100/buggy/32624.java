private static java.lang.String makeTitle(java.util.Collection<com.intellij.openapi.vfs.VirtualFile> unregisteredRoots, java.util.Collection<com.intellij.openapi.vfs.VirtualFile> invalidRoots) {
    java.lang.String title;
    java.lang.String roots = com.intellij.openapi.util.text.StringUtil.pluralize("root", invalidRoots.size());
    if (unregisteredRoots.isEmpty()) {
        title = "Invalid Git " + roots;
    }else
        if (invalidRoots.isEmpty()) {
            title = ("Unregistered Git " + roots) + " detected";
        }else {
            title = "Git root configuration problems";
        }
    
    return title;
}