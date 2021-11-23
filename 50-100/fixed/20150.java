public static int getRandomIndexExclude(java.lang.Integer excludeIndex, int bound, boolean allowZero) {
    java.lang.Integer index;
    do {
        index = util.RandomUtils.random.nextInt(bound);
    } while (((index == 0) && (!allowZero)) || (index.equals(excludeIndex)) );
    return index;
}