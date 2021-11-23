public static DiceValue getRandom() {
    java.lang.System.out.println(("---Bug 4 detector: SPADE dice index: " + (DiceValue.SPADE.ordinal())));
    int random = DiceValue.RANDOM.nextInt(((DiceValue.SPADE.ordinal()) + 1));
    java.lang.System.out.println(("---Bug 4 detector: Ramdom value generated: " + random));
    return DiceValue.values()[random];
}