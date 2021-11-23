long nextKeynum() {
    long keynum;
    if ((keychooser) instanceof com.yahoo.ycsb.generator.ExponentialGenerator) {
        do {
            keynum = (transactioninsertkeysequence.lastValue()) - (keychooser.nextValue().longValue());
        } while (keynum < 0 );
    }else {
        do {
            keynum = keychooser.nextValue().intValue();
        } while (keynum > (transactioninsertkeysequence.lastValue()) );
    }
    return keynum;
}