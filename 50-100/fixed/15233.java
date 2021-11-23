public static boolean saveFile(java.lang.String content, java.lang.String fileName) {
    java.io.FileWriter writer = null;
    try {
        writer = new java.io.FileWriter(fileName);
        writer.write(content);
        writer.close();
        return true;
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("fail to save file " + (e.getMessage())));
        return false;
    } finally {
        if (writer != null)
            try {
                writer.close();
            } catch (java.io.IOException e) {
            }
        
    }
}