private boolean compareNotEqual(final int value, final int compareValue, final int unspecifiedConstant) {
    return ((value != unspecifiedConstant) && (compareValue != unspecifiedConstant)) && ((value - compareValue) != 0);
}