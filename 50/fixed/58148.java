public int roll() {
    int rolled = 0;
    java.util.Random rollTheDice = new java.util.Random();
    while (rolled == 0) {
        rolled = rollTheDice.nextInt(diceSize);
    } 
    (numberOfStrokes)++;
    return rolled;
}