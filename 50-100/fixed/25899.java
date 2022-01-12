public void overFlowCheck() {
    if ((player.getMana()) >= (player.getMaxMana())) {
        CE.overflow = true;
    }
    if (CE.split) {
        (CE.splitTimer)--;
    }
    if ((CE.splitTimer) <= 0) {
        CE.split = false;
        CE.splitAmount = 0;
    }
}