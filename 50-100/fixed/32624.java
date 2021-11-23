private static java.lang.String makeTitle(java.util.Collection<com.intellij.openapi.vfs.VirtualFile> unregisteredRoots, java.util.Collection<com.intellij.openapi.vfs.VirtualFile> invalidRoots) {
    java.lang.String title;
    if (unregisteredRoots.isEmpty()) {
        title = "Invalid Git " + (com.intellij.openapi.util.text.StringUtil.pluralize("root", invalidRoots.size()));
    }else
        if (invalidRoots.isEmpty()) {
            title = ("Unregistered Git " + (com.intellij.openapi.util.text.StringUtil.pluralize("root", unregisteredRoots.size()))) + " detected";
        }else {
            title = "Git root configuration problems";
        }
    
    return title;
}