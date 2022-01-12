private boolean validateTypeMismatch(slp.TypeEntry expectedType, slp.TypeEntry actualType) {
    int expectedDimension = expectedType.getTypeDimension();
    int actualDimension = actualType.getTypeDimension();
    if (expectedDimension != actualDimension)
        return false;
    
    boolean isArray = expectedDimension != 0;
    if (isArray && ((expectedType.getEntryId()) != (actualType.getEntryId())))
        return false;
    
    if (!(isA(expectedType, actualType)))
        return false;
    
    return true;
}