public void saveHighscores() {
    loadHighscores();
    try {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(highscoreFile, false);
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
        oos.writeObject(highscores);
        oos.flush();
        oos.close();
        fos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}