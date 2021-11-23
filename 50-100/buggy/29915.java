public static void writeSave(java.lang.String save, edu.cpp.cs.cs141.GECLYfinalproj.Grid board) {
    try {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(save);
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
        oos.writeObject(board);
        oos.close();
    } catch (java.io.IOException X) {
        java.lang.System.out.println("The game could not be saved.");
    }
}