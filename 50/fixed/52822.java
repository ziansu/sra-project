public static void main(java.lang.String[] args) {
    final java.util.List<klondike.Klondike.Move> pv = new java.util.ArrayList<>();
    klondike.Solver.playOneGame(pv);
    java.lang.System.out.println(pv);
}