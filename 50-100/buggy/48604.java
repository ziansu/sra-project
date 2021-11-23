public org.ballerinalang.model.values.BValue[] execute(org.ballerinalang.bre.Context ctx) {
    long start = getIntArgument(ctx, 0);
    long end = getIntArgument(ctx, 1);
    long random = java.util.concurrent.ThreadLocalRandom.current().nextLong(start, (end + 1));
    return getBValues(new org.ballerinalang.model.values.BInteger(random));
}