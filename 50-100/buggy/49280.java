public Board twin() {
    Board twin = new Board(blocks);
    for (int i = 0; i < (n); i++) {
        if (((blocks[i][0]) != 0) && ((blocks[i][1]) != 0)) {
            twin.swap(i, 0, i, 1);
        }
    }
    return twin;
}