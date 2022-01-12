private void heapifyUp(int idx) {
    if (idx == 0)
        return ;
    
    int parentIdx = idx / 2;
    Key parentKey = data.get(parentIdx);
    Key currentKey = data.get(idx);
    if ((parentKey.compareTo(currentKey)) > 0) {
        Key tmp = parentKey;
        data.set(parentIdx, currentKey);
        data.set(idx, tmp);
        heapifyUp(parentIdx);
    }
}