public void savegame() {
    java.io.File file = save;
    try {
        java.io.FileOutputStream fileStream;
        fileStream = new java.io.FileOutputStream(file);
        java.io.ObjectOutputStream objectStream = new java.io.ObjectOutputStream(fileStream);
        objectStream.writeObject(board);
        objectStream.writeObject(getBoard().getScore());
        objectStream.writeObject(new java.lang.Integer(getBoard().getHighScore()));
        objectStream.close();
        fileStream.close();
    } catch (java.lang.Exception e) {
    }
}