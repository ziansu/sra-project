public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    eventManager.setCurrentGameObject(gameObject);
    gameObjectPopup = new com.mygdx.popup.GameObjectPopup();
    gameObjectPopup.setAtlasUiAssets(atlasUiAssets);
    gameObjectPopup.setListenerFactory(listenerFactory);
    gameObjectPopup.setGameObject(gameObject);
    gameObjectPopup.setConstantsAssets(constantsAssets);
    gameObjectPopup.initialize(objectName);
    addActor(gameObjectPopup);
    gameObjectPopup.setVisible(true);
}