@java.lang.SuppressWarnings(value = "unchecked")
public void readFromFile(java.lang.String filename) {
    try {
        java.io.FileInputStream fileIn = new java.io.FileInputStream(filename);
        java.io.ObjectInputStream objectIn = new java.io.ObjectInputStream(fileIn);
        savedGames = ((java.util.ArrayList<bradbury.je.finalproject305.modelpackage.SavedGame>) (objectIn.readObject()));
        objectIn.close();
        fileIn.close();
        bradbury.je.finalproject305.modelpackage.SaveLoadGame.LOGGER.log(org.apache.log4j.Level.INFO, "Successfully read games from saved file.");
    } catch (java.lang.Exception e) {
        bradbury.je.finalproject305.modelpackage.SaveLoadGame.LOGGER.log(org.apache.log4j.Level.ERROR, e.toString(), e);
    }
}