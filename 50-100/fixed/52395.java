public static java.lang.Object load(java.lang.String fileName) {
    try {
        java.lang.Object o;
        java.io.FileInputStream fis = new java.io.FileInputStream(new java.io.File(((com.rpsg.rpg.io.Files.getABSPath()) + fileName)));
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
        o = ois.readObject();
        ois.close();
        return o;
    } catch (java.lang.Exception e) {
        return null;
    }
}