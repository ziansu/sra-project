public void editPlayer(java.lang.String name, info.dylansymons.fpfrhelper.firefighter.Firefighter firefighter, int color, info.dylansymons.fpfrhelper.player.Player player) {
    enableFab(false);
    int index = mGame.getPlayerList().indexOf(player);
    player.setFirefighter(firefighter);
    mColourList.remove(java.lang.Integer.valueOf(color));
    player.setColour(color);
    player.setName(name);
    mAdapter.notifyItemChanged(index);
    checkButtonEnableState();
}