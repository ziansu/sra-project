private static boolean isSortingRangeBiggerOneElement(final int fromIndex, final int toIndex) {
    if ((fromIndex >= 0) && (toIndex >= 0)) {
        return fromIndex < toIndex;
    }else {
        return false;
    }
}