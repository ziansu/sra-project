public edu.cpp.cs.cs141.prog_final.GameEngine restoreGame() {
    edu.cpp.cs.cs141.prog_final.GameEngine game = new edu.cpp.cs.cs141.prog_final.GameEngine(null);
    try {
        fis = new java.io.FileInputStream(saveFile);
        ois = new java.io.ObjectInputStream(fis);
        game = ((edu.cpp.cs.cs141.prog_final.GameEngine) (ois.readObject()));
        fis.close();
        ois.close();
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    return game;
}