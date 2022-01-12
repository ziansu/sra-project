public boolean keyDown(int keycode) {
    if (menuView.getGameOver()) {
        if (keycode == (Input.Keys.ENTER)) {
            com.crap.game.controller.StateController.updateState(GameStates.STARTMENU);
            menuView.dispose();
        }
    }else {
        if (keycode == (Input.Keys.ENTER)) {
            changeScreen();
        }
        if (keycode == (Input.Keys.DOWN)) {
            menuModel.setCurrentItem("down");
        }
        if (keycode == (Input.Keys.UP)) {
            menuModel.setCurrentItem("up");
        }
    }
    return true;
}