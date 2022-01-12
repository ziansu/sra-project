public void overFlowCheck() {
    player.setMana(((player.getMana()) - 2));
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