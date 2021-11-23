public int getCommitIndex(int[] matchIndex) {
    int length = matchIndex.length;
    int[] tmp = new int[length];
    java.lang.System.arraycopy(matchIndex, 0, tmp, 0, length);
    java.util.Arrays.sort(tmp);
    assert (length % 2) == 1;
    int result = role.getCommitIndex();
    return result;
}