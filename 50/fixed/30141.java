public void underNMoves(java.lang.String sequence, int n) {
    java.util.ArrayList<java.lang.Character> myMoves = new java.util.ArrayList<java.lang.Character>();
    findAnswer(sequence, 0, n, ' ', myMoves);
    java.lang.System.out.println(answer);
    return ;
}