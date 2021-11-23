@java.lang.Override
public void initialize(com.jme3.app.state.AppStateManager stateManager, com.jme3.app.Application application) {
    jme3utilities.Validate.nonNull(stateManager, "state manager");
    jme3utilities.Validate.nonNull(application, "application");
    com.jme3.asset.AssetManager am = application.getAssetManager();
    com.jme3.cursors.plugins.JmeCursor cursor = ((com.jme3.cursors.plugins.JmeCursor) (am.loadAsset(jme3utilities.nifty.bind.BindInputMode.assetPath)));
    cursor.setxHotSpot(0);
    cursor.setyHotSpot(31);
    setCursor(cursor);
    super.initialize(stateManager, application);
}