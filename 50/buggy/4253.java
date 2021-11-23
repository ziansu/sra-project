private void initGame() {
    startFancyInputWatcher();
    initTimer();
    kanaRepository.getNextKana();
    openKeyboard();
    timer.start();
}