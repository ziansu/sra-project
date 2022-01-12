public static DiceValue getRandom() {
    int random = DiceValue.RANDOM.nextInt(((DiceValue.SPADE.ordinal()) + 1));
    return DiceValue.values()[random];
}