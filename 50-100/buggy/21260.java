private void initNifty() {
    com.jme3.niftygui.NiftyJmeDisplay niftyDisplay = new com.jme3.niftygui.NiftyJmeDisplay(assetManager, inputManager, audioRenderer, guiViewPort);
    nifty = niftyDisplay.getNifty();
    guiViewPort.addProcessor(niftyDisplay);
    nifty.fromXml("Interface/start.xml", "start", new client.MyStartScreen(this, nifty));
    nifty.setDebugOptionPanelColors(false);
    java.awt.TextField textField;
}