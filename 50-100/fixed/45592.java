public static java.util.HashMap readSave() {
    java.util.HashMap incomingSaveData = null;
    try {
        java.io.FileInputStream fileIn = new java.io.FileInputStream(java.lang.String.valueOf(Start.saveFilePath));
        java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
        incomingSaveData = ((java.util.HashMap<java.lang.String, java.util.HashMap>) (in.readObject()));
        in.close();
        fileIn.close();
    } catch (java.lang.Exception i) {
        i.printStackTrace();
    }
    return incomingSaveData;
}