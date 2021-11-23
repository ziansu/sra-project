public void setActiveMenu(edu.chalmers.vaporwave.controller.MenuState activeMenu) {
    if (!(this.menuMusic.isPlaying())) {
        this.menuMusic.playSound();
        this.menuMusic.loopSound(true);
    }
    if (activeMenu == (MenuState.ROOSTER)) {
        updatePlayerGamePads(this.newGameEvent.getPlayers(), true);
    }
    this.activeMenu = activeMenu;
}