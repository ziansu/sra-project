public static void SetPuzzle(tilitoli.Puzzle p) {
    synchronized(tilitoli.NetworkClient.puzzle) {
        tilitoli.NetworkClient.puzzle = p;
    }
}