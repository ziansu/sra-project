public void execute(game.Entity user) {
    user.setHealth(((user.getHealth()) + (actionHealing)));
    user.setMana(((user.getMana()) + (actionManaRestore)));
    me.setVX(((me.getVX()) + (selfDeltaVX)));
    me.setVY(((me.getVY()) + (selfDeltaVY)));
    animation.draw();
}