public void dispenseCoins(java.util.List<java.lang.Integer> coins) throws coindispenser.DispenserError {
    int[] newcounts = coinCounters;
    for (int c : coins) {
        int index = getValueIndex(c);
        if (index < 0)
            throw new coindispenser.DispenserError((("Unknown coin type '" + c) + "'"));
        
        if ((newcounts[index]) < 1)
            throw new coindispenser.DispenserError(("Not enough coins of type " + c));
        
        (newcounts[index])--;
    }
    coinCounters = newcounts;
}