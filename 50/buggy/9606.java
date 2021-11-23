public void setVisible(boolean visible, com.betmansmall.game.GameInterface.GameInterfaceElements element) {
    getElement(element).setVisible(visible);
    Gdx.app.log("TAAAAAAAAAG", ((("set " + visible) + " but") + (element.name())));
}