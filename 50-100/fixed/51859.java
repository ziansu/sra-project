public void resizeFrameWithContents() {
    int windowWidth = ((Client.Settings.CUSTOM_CLIENT_SIZE_X) + (getInsets().left)) + (getInsets().right);
    int windowHeight = ((Client.Settings.CUSTOM_CLIENT_SIZE_Y) + (getInsets().top)) + (getInsets().bottom);
    setSize(windowWidth, windowHeight);
}