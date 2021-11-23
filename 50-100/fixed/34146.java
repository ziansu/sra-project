private void initiateHealthBar() {
    int HPBarHelper = (player1.getHitPoints()) + (player2.getHitPoints());
    this.HPBar.setStartingMax(HPBarHelper);
    this.HPBar.setP2Max(HPBarHelper);
    this.HPBar.setDivider((HPBarHelper - (player2.getHitPoints())));
}