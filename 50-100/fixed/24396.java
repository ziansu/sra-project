private void scan(int[] beforeIndex, int[] afterIndex, boolean isPositive) {
    if (isPositive) {
        scan(lowerGhost, beforeIndex);
        scan(upperGhost, afterIndex);
    }else {
        scan(upperGhost, beforeIndex);
        scan(lowerGhost, afterIndex);
    }
}