public static edu.cpp.cs.cs141.GECLYfinalproj.Grid readSave(java.io.File save) {
    try {
        java.io.FileInputStream fis = new java.io.FileInputStream(save);
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
        return ((edu.cpp.cs.cs141.GECLYfinalproj.Grid) (ois.readObject()));
    } catch (java.lang.Exception X) {
        java.lang.System.out.println("Corrupt save.");
    }
    return null;
}