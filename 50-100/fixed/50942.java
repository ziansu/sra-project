private void applyFallDeath(java.lang.Character player) {
    if ((player.getPos().getY()) < (-150)) {
        if (player.equals(player1)) {
            HPBar.killP1();
        }
        if (player.equals(player2)) {
            HPBar.killP2();
        }
        return ;
    }
}