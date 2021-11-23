public void releaseSlot() {
    user_interface.account.content.fight.list.SnakePlayerList.getInstance().getList().add(currentPlayer);
    user_interface.account.content.fight.list.SnakePlayerList.getInstance().resize();
    user_interface.account.content.fight.list.SnakeViewerPane.getInstance().show(user_interface.account.content.fight.list.SnakeViewerPane.getSnakePlayerList().getItems());
    takeSlot(SnakePlayer.DEFAULT_SNAKE_PLAYER);
    isOccupied = false;
    setOnContextMenuRequested(null);
}