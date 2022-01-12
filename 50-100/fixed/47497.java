public void execute(game.Entity user) {
    user.setHealth(((user.getHealth()) + (actionHealing)));
    user.setMana(((user.getMana()) + (actionManaRestore)));
    user.setVX(((user.getVX()) + (selfDeltaVX)));
    user.setVY(((user.getVY()) + (selfDeltaVY)));
    animation.draw();
}