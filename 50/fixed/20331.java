private void setParent(int p_currentIndex, int p_paramIndex) {
    _back_meta[((p_currentIndex * (greycat.internal.heap.HeapTimeTreeChunk.META_SIZE)) + 2)] = p_paramIndex;
}