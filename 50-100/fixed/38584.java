private void loadLinterConfig() {
    try {
        tern.eclipse.ide.linter.core.ITernLinterConfig config = tern.eclipse.ide.linter.core.TernLinterCorePlugin.getDefault().getTernLinterConfigurationsManager().createLinterConfig(linterId);
        linterConfigBlock.setLinterConfig(config);
    } catch (java.lang.Throwable e) {
        tern.eclipse.ide.linter.internal.ui.Trace.trace(Trace.SEVERE, "Error while loading linter config.", e);
    }
}