public boolean hasNext() {
    return ((block) < ((blocks.length) - 1)) || ((in.valueCount()) < (blocks[block].valueCount));
}