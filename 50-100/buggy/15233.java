public static boolean saveFile(java.lang.String content, java.lang.String fileName) {
    try {
        java.io.FileWriter writer = new java.io.FileWriter(fileName);
        writer.write(content);
        writer.close();
        return true;
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("fail to save file " + (e.getMessage())));
        return false;
    }
}