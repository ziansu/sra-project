public boolean connected(int a, int b) {
    if (((map[a]) == null) || ((map[b]) == null)) {
        return false;
    }
    return (map[a]) == (map[b]);
}