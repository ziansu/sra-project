public void rollDice() {
    final int DICE_MAX = 6;
    final int DICE_MIN = 1;
    java.util.Random randomGenerator = new java.util.Random();
    dice = (randomGenerator.nextInt(((DICE_MAX - DICE_MIN) + 1))) + DICE_MIN;
}