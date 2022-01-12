public void setStartMenuMode() {
    tankRevolution.services.AssetsManager.getInstance().loadStartMenuAssets();
    if ((view) != null)
        view.dispose();
    
    view = new tankRevolution.StartMenuView();
    mainController.setStartMenuMode(this);
}