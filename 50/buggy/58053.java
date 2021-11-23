public int windowSize() {
    if ((this.levels.size()) == 0) {
        return 0;
    }
    return this.levels.get(0).size();
}