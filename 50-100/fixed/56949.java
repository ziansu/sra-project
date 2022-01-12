protected com.intellij.openapi.editor.Document getModuleScript() {
    com.intellij.openapi.module.Module module = com.intellij.openapi.module.ModuleManager.getInstance(mProject).findModuleByName(mModule);
    com.intellij.openapi.vfs.VirtualFile root = module.getModuleFile().getParent();
    com.intellij.openapi.vfs.VirtualFile script = root.findChild("build.gradle");
    if (script == null) {
        return null;
    }
    com.intellij.openapi.editor.Document document = com.intellij.openapi.fileEditor.FileDocumentManager.getInstance().getDocument(script);
    return document;
}