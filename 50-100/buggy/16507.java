public final gamelogic.SpecialSymbolColour specialRandom() {
    final int num = (gamelogic.SpecialSymbolColour.values().length) - 1;
    java.util.Random random = new java.util.Random();
    int squareNumber = random.nextInt(num);
    gamelogic.SpecialSymbolColour rand = SpecialSymbolColour.BLACK;
    rand = gamelogic.SpecialSymbolColour.values()[0];
    return rand;
}