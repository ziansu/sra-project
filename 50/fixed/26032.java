public static int rollDice() {
    java.util.Random generator = new java.util.Random();
    return (generator.nextInt(Assn1_15rws.DICE_SIDES)) + 1;
}