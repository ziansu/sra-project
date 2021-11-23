private void scan(java.util.Set<java.lang.Integer> blank, int[] beforeIndex, int[] afterIndex, boolean isPositive) {
    if (isPositive) {
        scan(lowerGhost, beforeIndex);
        scan(upperGhost, afterIndex);
    }else {
        scan(upperGhost, beforeIndex);
        scan(lowerGhost, afterIndex);
    }
    for (int i : afterIndex) {
        blank.add(i);
    }
}