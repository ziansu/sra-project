public static int getDice(int howMany, int diceSize) {
    int val = 0;
    if (diceSize == 0)
        return 0;
    
    java.util.Random rand = new java.util.Random(java.lang.System.currentTimeMillis());
    for (int i = 1; i <= howMany; i++) {
        val += ((java.lang.Math.abs(rand.nextInt())) % diceSize) + 1;
    }
    return val;
}