public void setTitleComponent(com.codename1.ui.Component titleCmp) {
    checkIfInitialized();
    if ((titleComponent) != null) {
        titleComponent.remove();
    }
    titleComponent = titleCmp;
    addComponent(BorderLayout.CENTER, titleComponent);
}