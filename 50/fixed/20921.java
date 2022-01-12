public boolean end(int addr, int line) {
    if (!(isEnd)) {
        this.isEnd = true;
        this.endAddr = addr;
        return true;
    }
    return false;
}