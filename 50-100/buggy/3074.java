public boolean triThreat(int[] s, int h) {
    return (((s[0]) == 0) && ((s[5]) == 0)) && (((((s[1]) + (s[2])) + (s[3])) + (s[4])) == (3 * h));
}