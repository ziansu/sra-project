private void onDeath(boolean markAsDead) {
    if (com.dejdav.snakefever.Player.DEBUG_DIE) {
        alive = false;
        effects.clear();
        if (markAsDead) {
            com.dejdav.snakefever.Game.getInstance().markAsDead(this);
        }
    }
}