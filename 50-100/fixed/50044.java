@java.lang.Override
public void initialize(com.jme3.app.state.AppStateManager stateManager, com.jme3.app.Application application) {
    com.jme3.asset.AssetManager am = application.getAssetManager();
    com.jme3.cursors.plugins.JmeCursor cursor = ((com.jme3.cursors.plugins.JmeCursor) (am.loadAsset(jme3utilities.nifty.MenuInputMode.assetPath)));
    setCursor(cursor);
    super.initialize(stateManager, application);
}