private void mapLetters(BoggleBoard board, int rows, int cols) {
    letters = new edu.princeton.cs.algs4.SeparateChainingHashST<java.lang.Integer, java.lang.Character>();
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++) {
            int x = (i * rows) + j;
            letters.put(x, board.getLetter(i, j));
        }
    
}