protected java.lang.Object deSerialize() {
    java.lang.Object freshData = null;
    try {
        if ((myType) == 0)
            inFile = new java.io.FileInputStream("Files/user.ser");
        else
            inFile = new java.io.FileInputStream("Files/job.ser");
        
        in = new java.io.ObjectInputStream(inFile);
        freshData = in.readObject();
        inFile.close();
        in.close();
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    return freshData;
}