private int[] getSequenceComparisonPosition(java.lang.String a, java.lang.String b, java.lang.String c) {
    int[] position = new int[2];
    position[0] = 0;
    position[1] = a.length();
    if ((gap.equals("distinctive")) || (gap.equals("inner"))) {
        TIPars.endTrailingGap3(position, a, b, c);
    }
    return position;
}