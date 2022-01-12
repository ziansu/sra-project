private int[] append(int[] parents, int i) {
    int[] all = new int[(parents.length) + 1];
    java.lang.System.arraycopy(parents, 0, all, 0, parents.length);
    all[((all.length) - 1)] = i;
    return all;
}