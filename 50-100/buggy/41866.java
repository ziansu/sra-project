public void newGame() {
    g = new main.Game.Game();
    n = 1;
    g.Shuffle();
    Mycards.clear();
    Computercards.clear();
    Mycs = 4;
    Cmpcs = 4;
    ComputerContinue = false;
    Computerlose = false;
    Mylose = false;
    for (int i = 1; i <= 4; i++) {
        DealMyCard();
        DealCmpCard();
    }
    java.util.Collections.sort(Mycards, comparator);
    java.util.Collections.sort(Computercards, comparator);
    repaint();
}