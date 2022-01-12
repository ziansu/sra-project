@java.lang.Override
public void perform(@org.jetbrains.annotations.NotNull
io.flutter.sdk.FlutterSdk sdk, @org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, com.intellij.openapi.actionSystem.AnActionEvent event) throws com.intellij.execution.ExecutionException {
    final com.intellij.openapi.util.Pair<com.intellij.openapi.module.Module, com.intellij.openapi.vfs.VirtualFile> pair = getModuleAndPubspecYamlFile(project, event);
    if (pair != null) {
        sdk.run(io.flutter.actions.FlutterPackagesGetAction.COMMAND, pair.first, pair.second.getParent(), null);
    }else {
        io.flutter.FlutterErrors.showError(io.flutter.FlutterBundle.message("flutter.command.missing.pubspec"), io.flutter.FlutterBundle.message("flutter.command.missing.pubspec.message", io.flutter.actions.FlutterPackagesGetAction.COMMAND.name()));
    }
}