@java.lang.Override
public void runAtEndOfTurn() {
    myRC.yield();
    checkAndAttemptCreateConvoy();
    aboutToDie();
    pingPresence();
    this.findWeakFriendsAndTransferFlux();
}