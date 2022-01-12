public static long number(long minimum, long maximum) {
    assert minimum <= maximum;
    long value = ((java.lang.Math.abs(edu.brown.benchmark.ycsb.YCSBUtil.rand.nextInt())) % ((maximum - minimum) + 1)) + minimum;
    value = java.lang.Math.abs(value);
    assert (minimum <= value) && (value <= maximum) : java.lang.String.format("Unexpected invalid random number '%d' [min=%d / max=%d]", value, minimum, maximum);
    return value;
}