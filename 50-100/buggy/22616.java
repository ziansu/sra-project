private int search(int index, int size, Swapping.Memory memory) {
    int sizeAtIndex = memory.checkMem(index);
    if (sizeAtIndex >= size)
        return index;
    
    Swapping.Memory.Block nextBlock = memory.getNextBlock(index);
    if ((nextBlock.getSize()) >= size) {
        return nextBlock.getIndex();
    }
    if ((nextBlock.getIndex()) == (lastIndex)) {
        return -1;
    }
    return search(index, size, memory);
}