private static boolean playOneGame(java.util.List<klondike.Klondike.Move> pv) {
    klondike.Klondike klondike = new klondike.Klondike();
    return klondike.Solver.nextTurn(klondike, pv, new java.util.HashSet<>());
}