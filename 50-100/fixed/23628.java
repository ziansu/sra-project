public static boolean isBitSet(long value, int bit) {
    com.sangupta.jerry.util.CheckUtils.checkArgument((bit >= (com.sangupta.jerry.util.BitUtils.LEAST_BIT)), "Bit to set cannot be less than zero");
    com.sangupta.jerry.util.CheckUtils.checkArgument((bit <= (com.sangupta.jerry.util.BitUtils.MAX_BIT_LONG)), ("Bit to set cannot be greater than " + (com.sangupta.jerry.util.BitUtils.MAX_BIT_LONG)));
    long mask = 1L << bit;
    return ((long) (value & mask)) != 0L;
}