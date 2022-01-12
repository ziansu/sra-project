public boolean balanceExceedsLimitBy(int amount) {
    java.lang.System.err.println(limit);
    java.lang.System.err.println(((balance) - amount));
    return ((balance) - amount) > (limit);
}