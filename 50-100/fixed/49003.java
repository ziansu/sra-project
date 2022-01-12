public int revealHints() {
    java.lang.System.out.println((("hints = " + (powerUps.getHints())) + "*********************"));
    if (((powerUps.getHints()) > 1) && (!(hintsRevealed))) {
        powerUps.setHints(((powerUps.getHints()) - 1));
        hintsRevealed = true;
        notifyAllObservers();
    }
    return powerUps.getHints();
}