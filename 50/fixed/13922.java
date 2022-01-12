public static final boolean isSubset(char[] set1, char[] set2) {
    return (programming5.arrays.SetOperations.difference(set1, set2).length) == 0;
}