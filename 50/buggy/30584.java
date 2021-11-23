@java.lang.Override
protected final void onPickup(final sem.group47.entity.Player p) {
    p.setMaxSpeed(((p.getMaxSpeed()) + 1.8));
    p.setMovSpeed(((getMovSpeed()) + 1.8));
}