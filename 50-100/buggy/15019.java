void setupProject(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.roots.ModifiableRootModel model, @org.jetbrains.annotations.NotNull
final com.intellij.openapi.vfs.VirtualFile baseDir) {
    final io.flutter.sdk.FlutterSdk sdk = getFlutterSdk();
    if (sdk == null) {
        return ;
    }
    try {
        sdk.run(FlutterSdk.Command.CREATE, model.getModule(), baseDir, baseDir.getPath());
    } catch (com.intellij.execution.ExecutionException e) {
        io.flutter.module.FlutterModuleBuilder.LOG.warn(e);
    }
}