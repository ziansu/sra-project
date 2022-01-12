public Block getLargestOpenBlock() {
    Block largestOpenBlock = memory.get(0);
    for (int i = 1; i < ((memory.size()) - 1); i++) {
        if (((memory.get(i).size) > (largestOpenBlock.size)) && (!(memory.get(i).occupied))) {
            largestOpenBlock = memory.get(i);
        }
    }
    return largestOpenBlock;
}