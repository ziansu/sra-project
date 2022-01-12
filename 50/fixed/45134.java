boolean shouldPreferSettersOverCtor(int noOfCtorArgs, int noOfSetters) {
    return (0 < noOfSetters) && ((noOfCtorArgs * (((minPercentOfExcessiveSettersToPreferDefaultCtor) + 100.0F) / 100.0F)) <= ((float) (noOfSetters)));
}