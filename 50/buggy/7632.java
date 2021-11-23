private void updatePlayer(model.Player p) {
    if (p.isDead()) {
        p.getSpriteBase().setImage("/BubbleBobbleDeath.png");
    }
    update(p.getSpriteBase());
}