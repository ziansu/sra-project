public int[] getAllThreadIDs() {
    if ((threadIDs) != null) {
        int[] result = new int[threadIDs.size()];
        for (int i = 0; i < (threadIDs.size()); ++i) {
            result[i] = threadIDs.get(i);
        }
        return result;
    }
    return new int[]{  };
}