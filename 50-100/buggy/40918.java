private static void isIllegalBounds(java.lang.Class clazz, float minBound, float maxBound, boolean leftBound, boolean rightBound) {
    if (minBound >= maxBound)
        throw new java.lang.IllegalArgumentException(workshop.RandomEnchancer.ILLEGAL_BOUNDARIES);
    
    if ((((minBound != maxBound) && (!leftBound)) && (!rightBound)) && (workshop.RandomEnchancer.isClassForIntegerValue(clazz)))
        throw new java.lang.IllegalArgumentException(workshop.RandomEnchancer.ILLEGAL_BOUNDARIES_ALTERNATE);
    
}