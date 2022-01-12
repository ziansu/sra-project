@org.mustbe.consulo.RequiredDispatchThread
private void updateSecondComponent(@org.jetbrains.annotations.Nullable
org.consulo.module.extension.MutableModuleExtension<?> extension) {
    javax.swing.JComponent secondComponent = mySplitter.getSecondComponent();
    if (secondComponent instanceof com.intellij.openapi.Disposable) {
        com.intellij.openapi.util.Disposer.dispose(((com.intellij.openapi.Disposable) (secondComponent)));
    }
    if ((extension == null) || (!(extension.isEnabled()))) {
        mySplitter.setSecondComponent(null);
    }else {
        mySplitter.setSecondComponent(createConfigurationPanel(extension));
    }
}