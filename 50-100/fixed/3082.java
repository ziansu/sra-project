public void startInteract(com.sidescroller.player.Player player) {
    isActivated = !(isActivated);
    if (isActivated) {
        player.setLeftKey(false);
        player.setRightKey(false);
        player.setUpKey(false);
        leftKey = player.getLeftKey();
        rightKey = player.getRightKey();
    }else {
        player.setLeftKey(true);
        player.setRightKey(true);
        player.setUpKey(true);
        leftKey = Input.Keys.UNKNOWN;
        rightKey = Input.Keys.UNKNOWN;
    }
}