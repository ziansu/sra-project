public void test026() {
    java.lang.String position = "r2q1r2/p1pb1kpQ/3pR3/1p1n4/4pP2/8/PP2B1PP/6K1 b - f3 0 0";
    org.formulachess.engine.ChessEngine model = new org.formulachess.engine.ChessEngine(java.util.Locale.getDefault(), position);
    long[] moves = model.allMoves();
    assertEquals(org.formulachess.engine.tests.TestAllMoves.WRONG_SIZE, 31, moves.length);
    playAllMoves(position, model, moves);
    display("test026", model, moves, "Cb4 Cb6 Cc3 Ce3 Ce7 Cf6 Cxf4 Db8 Dc8 De7 De8 Df6 Dg5 Dh4 Fc6 Fc8 Fe8 Fxe6 Rxe6 Tb8 Tc8 Te8 Tg8 Th8 a5 a6 b4 c5 c6 e3 exf3 ");
}