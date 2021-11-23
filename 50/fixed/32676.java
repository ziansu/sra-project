public static DiceValue getRandom() {
    int random = DiceValue.RANDOM.nextInt(DiceValue.values().length);
    return DiceValue.values()[random];
}