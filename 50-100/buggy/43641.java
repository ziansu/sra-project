public static void main(java.lang.String[] args) {
    Chessboard chessboard = new Chessboard(8);
    BruteForce algo = new BruteForce(chessboard);
    java.lang.System.out.println(("Puzzle solve time: " + (algo.getTime())));
    java.lang.System.out.print(algo.chessboard.toString());
}