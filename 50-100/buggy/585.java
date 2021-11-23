void savePosition() {
    java.util.Properties properties = board.getProperties();
    properties.setProperty("codeWindowPosX", ("" + (getBounds().x)));
    properties.setProperty("codeWindowPosY", ("" + (getBounds().y)));
    properties.setProperty("codeWindowWidth", ("" + (getBounds().width)));
    properties.setProperty("codeWindowHeight", ("" + (getBounds().height)));
    board.saveProperties();
}