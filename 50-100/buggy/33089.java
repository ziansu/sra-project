private void initializeHUD() {
    com.jme3.niftygui.NiftyJmeDisplay niftyDisplay = com.jme3.niftygui.NiftyJmeDisplay.newNiftyJmeDisplay(assetManager, inputManager, audioRenderer, guiViewPort);
    de.lessvoid.nifty.Nifty nifty = niftyDisplay.getNifty();
    ui.HUDController hudController = new ui.HUDController(eventHandlers, cam);
    nifty.fromXml("assets/Interface/hud.xml", "hud", hudController);
    guiViewPort.addProcessor(niftyDisplay);
    model.Player.getInstance().addObserver(hudController);
    model.World.getInstance().addObserver(hudController);
    eventHandlers.addObserver(hudController);
}