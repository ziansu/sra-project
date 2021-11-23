public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String expFileName = "Example.txt";
    java.io.FileInputStream fis = new java.io.FileInputStream(expFileName);
    threading.runnables.GameRunnable mainGame = new threading.runnables.GameRunnable();
    parsing.GameParser gp = new parsing.GameParser();
    gp.parse(fis, mainGame);
    threading.threads.GeneralThread gameCapsule = new threading.threads.GeneralThread(mainGame);
    gameCapsule.start();
}