private com.intellij.openapi.vfs.VirtualFile getSourceRoot(com.intellij.openapi.module.Module module) {
    if (module != null) {
        com.intellij.openapi.vfs.VirtualFile[] sourcesRoots = com.intellij.openapi.roots.ModuleRootManager.getInstance(module).getSourceRoots();
        if ((sourcesRoots.length) >= 1) {
            return sourcesRoots[0];
        }
    }
    return null;
}