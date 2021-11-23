public boolean hasNext() {
    return ((block) < (blocks.length)) && ((in.valueCount()) < (blocks[block].valueCount));
}