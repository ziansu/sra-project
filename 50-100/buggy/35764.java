public void addPlayer(java.lang.String name, info.dylansymons.fpfrhelper.firefighter.Firefighter firefighter, int color) {
    enableFab(false);
    mGame.getFirefighterList().setChosen(firefighter, true);
    mColourList.remove(java.lang.Integer.valueOf(color));
    mGame.getPlayerList().add(new info.dylansymons.fpfrhelper.player.Player(name, firefighter, color));
    mAdapter.notifyItemInserted(((mGame.getPlayerList().size()) - 1));
    checkButtonEnableState();
}