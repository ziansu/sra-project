@java.lang.Override
public java.io.File testSource(java.io.File appBase) {
    return act.app.ProjectLayout.Utils.file(appBase, "src/test/java");
}