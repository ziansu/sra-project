@java.lang.Override
public void run() {
    while (true) {
        engine.Server.getLock();
        try {
            game.run();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        } finally {
            engine.Server.releaseLock();
        }
        try {
            java.lang.Thread.sleep(game.delayBetweenRuns());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}