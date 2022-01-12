public int[] getPhase() {
    int[] phases = new int[update.getPlayer().length];
    for (int i = 0; i < (phases.length); i++) {
        phases[i] = update.getPlayer()[i].getPhase();
    }
    return phases;
}