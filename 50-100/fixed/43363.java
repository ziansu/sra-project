@org.jetbrains.annotations.Nullable
private com.intellij.openapi.vfs.VirtualFile getSourceRoot(@org.jetbrains.annotations.Nullable
final com.intellij.openapi.module.Module module) {
    if (module != null) {
        final com.intellij.openapi.vfs.VirtualFile[] sourcesRoots = com.intellij.openapi.roots.ModuleRootManager.getInstance(module).getSourceRoots();
        if ((sourcesRoots.length) >= 1) {
            return sourcesRoots[0];
        }
    }
    return null;
}