public void navigateToGameViewForAcceptingNetworkPlay(java.lang.String ipAddress) {
    Views.Interfaces.GameView view = this.switchToGameViewWithSizeDefinedInSettings();
    Controller.GameViewController controller = new Controller.NetworkGameViewController(view, this, this.networkRequestManager, ipAddress);
    view.setListener(controller);
    view.setPlayer(GameState.MyTurn);
    controller.init(GameState.MyTurn);
}