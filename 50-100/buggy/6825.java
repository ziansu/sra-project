@java.lang.Override
public void run() {
    final magic.ai.MMAB.MMABWorker worker = new magic.ai.MMAB.MMABWorker(java.lang.Thread.currentThread().getId(), workerGame, scoreBoard, CHEAT);
    worker.evaluateGame(achoice, scoreRef.get(), ((java.lang.System.nanoTime()) + slice));
    scoreRef.update(achoice.aiScore.getScore());
}