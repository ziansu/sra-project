private int getFreeBlock() {
    if ((numFreeBlocks) == 0) {
        throw new decaf.tacvm.exec.ExecuteException("Insufficent Memory");
    }
    int id = freeBlocks[(--(numFreeBlocks))];
    java.util.Arrays.fill(memory, (id << 10), ((id << 10) + 1024), 0);
    return id;
}