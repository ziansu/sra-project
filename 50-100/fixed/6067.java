@org.mustbe.consulo.RequiredDispatchThread
private void updateSecondComponent(@org.jetbrains.annotations.Nullable
org.consulo.module.extension.MutableModuleExtension<?> extension) {
    if ((extension == null) || (!(extension.isEnabled()))) {
        mySplitter.setSecondComponent(null);
    }else {
        mySplitter.setSecondComponent(createConfigurationPanel(extension));
    }
}