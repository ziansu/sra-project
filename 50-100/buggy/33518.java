public static com.barmin.logic.User getUserFromFile(java.lang.String pathName) throws java.lang.ClassNotFoundException {
    java.io.File yourFile = new java.io.File(pathName);
    try {
        boolean bool = yourFile.createNewFile();
        if (bool) {
            java.io.ObjectInputStream inputStream = new java.io.ObjectInputStream(new java.io.FileInputStream(yourFile));
            return ((com.barmin.logic.User) (inputStream.readObject()));
        }else {
            return null;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}