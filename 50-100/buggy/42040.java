@org.jetbrains.annotations.Nullable
public static com.twitter.intellij.pants.model.PantsOptions getPantsOptions(final com.intellij.openapi.project.Project myProject) {
    com.intellij.openapi.module.Module[] modules = com.intellij.openapi.module.ModuleManager.getInstance(myProject).getModules();
    if ((modules.length) == 0) {
        return null;
    }
    com.intellij.openapi.module.Module moduleSample = modules[0];
    com.intellij.openapi.vfs.VirtualFile pantsExecutable = com.twitter.intellij.pants.util.PantsUtil.findPantsExecutable(moduleSample.getModuleFile());
    if (pantsExecutable == null) {
        return null;
    }
    return new com.twitter.intellij.pants.model.PantsOptions(pantsExecutable.getPath());
}