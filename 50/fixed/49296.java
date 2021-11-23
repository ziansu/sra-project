public boolean isEmpty(int x, int y, int z) {
    return (isEmpty(x, y)) || (!(get(x, y).containsKey(z)));
}