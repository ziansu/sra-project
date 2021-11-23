@java.lang.Override
public Game.Carte playCard() {
    carteEnMain = sortHand(carteEnMain);
    try {
        gameActivity.writeToast("A votre tour");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.toString());
    }
    lock.lock();
    int c = gameActivity.playCard(carteEnMain);
    Game.Carte r = carteEnMain.get(c);
    carteEnMain.remove(c);
    lock.lock();
    lock.unlock();
    return r;
}