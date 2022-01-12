private boolean bulletIncoming() {
    boolean incoming = false;
    for (sprites.Tank opponent : opponents) {
        if (((isClearlyAlignedOpponent(opponent)) && (isAimedAtMe(opponent))) && ((opponent.getIsShot()) == 1)) {
            incoming = true;
        }
    }
    return incoming;
}