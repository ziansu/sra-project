public static java.util.ArrayList<java.lang.Integer> rollDice(int diceType, int numberOfRolls) {
    java.util.Random random = new java.util.Random();
    java.util.ArrayList<java.lang.Integer> result = new java.util.ArrayList();
    for (int i = 0; i < numberOfRolls; i++) {
        result.add(((random.nextInt((diceType - 1))) + 1));
    }
    return result;
}