public static DiceValue getRandom() {
    java.lang.System.out.println(("---Bug 4 detector: SPADE dice index: " + (DiceValue.SPADE.ordinal())));
    int random = DiceValue.RANDOM.nextInt(DiceValue.SPADE.ordinal());
    java.lang.System.out.println(("---Bug 4 detector: Ramdom value generated: " + random));
    return DiceValue.values()[random];
}