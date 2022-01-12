public java.lang.Enum getEnumByHashCode(long hashCode) {
    if ((enums) == null) {
        return null;
    }
    int enumIndex = java.util.Arrays.binarySearch(this.enumNameHashCodes, hashCode);
    if (enumIndex == (-1)) {
        return null;
    }
    return enums[enumIndex];
}