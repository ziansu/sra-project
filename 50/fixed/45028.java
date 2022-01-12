public void test027() {
    java.lang.String position = "r2q1r2/p1pb1kpQ/3pR3/1p1n4/4pP2/8/PP2B1PP/6K1 b - f3 0 0";
    org.formulachess.engine.ChessEngine model = new org.formulachess.engine.ChessEngine(java.util.Locale.getDefault(), position);
    assertEquals("different fen notation", position, model.toFENNotation());
}