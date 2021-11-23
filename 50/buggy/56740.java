public int getKeyCount() {
    int count = 0;
    try {
        count = this.keys.size();
    } finally {
    }
    return count;
}