public void writeToFile(java.lang.String filename) {
    try {
        java.io.FileOutputStream fileOut = new java.io.FileOutputStream(filename);
        java.io.ObjectOutputStream objectOut = new java.io.ObjectOutputStream(fileOut);
        objectOut.writeObject(savedGames);
        objectOut.close();
        bradbury.je.finalproject305.modelpackage.SaveLoadGame.LOGGER.log(org.apache.log4j.Level.INFO, "The saved games were successfully written to file.");
    } catch (java.lang.Exception e) {
        bradbury.je.finalproject305.modelpackage.SaveLoadGame.LOGGER.log(org.apache.log4j.Level.ERROR, e.toString(), e);
    }
}