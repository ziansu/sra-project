protected void disarm() {
    Dungeon.level.disarmTrap(pos);
    active = false;
    if ((sprite) != null) {
        sprite.visible = true;
        sprite.reset(this);
    }
}