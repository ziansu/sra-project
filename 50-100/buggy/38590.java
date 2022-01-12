int[] append(int[] parents, int extra) {
    int[] all = new int[(parents.length) + 1];
    java.lang.System.arraycopy(parents, 0, all, 0, parents.length);
    all[parents.length] = extra;
    return all;
}