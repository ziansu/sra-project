public void setTitleComponent(com.codename1.ui.Component titleCmp) {
    checkIfInitialized();
    titleComponent = titleCmp;
    addComponent(BorderLayout.CENTER, titleComponent);
}