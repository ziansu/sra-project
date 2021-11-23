public static void main(java.lang.String[] args) {
    Board board = new Board();
    java.lang.System.out.println(board);
    board.drawAll();
    java.lang.System.out.println(board);
    board.removeSet(0, 0, 0, 1, 0, 2);
    java.lang.System.out.println(board);
}