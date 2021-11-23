public int computerAI() {
    final java.util.concurrent.ExecutorService service = java.util.concurrent.Executors.newFixedThreadPool(1);
    final java.util.concurrent.Future<java.lang.Integer> task = service.submit(new mancala.ComputerAI(board.getCups()));
    try {
        final java.lang.Integer move = task.get();
        java.lang.System.out.println(move);
        return move;
    } catch (final java.lang.InterruptedException ex) {
        ex.printStackTrace();
    } catch (final java.util.concurrent.ExecutionException ex) {
        ex.printStackTrace();
    }
    service.shutdownNow();
    return 0;
}