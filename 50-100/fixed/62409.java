private void getSequenceComparisonPosition(int[] position, java.lang.String a, java.lang.String b, java.lang.String c) {
    position[0] = 0;
    position[1] = (a.length()) - 1;
    if ((gap.equals("distinctive")) || (gap.equals("inner"))) {
        TIPars.endTrailingGap3(position, a, b, c);
    }
}