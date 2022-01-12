public static void write(java.lang.String text, java.io.File file) {
    java.io.FileWriter fileWriter = null;
    try {
        fileWriter = new java.io.FileWriter(file, false);
        fileWriter.write(text);
        fileWriter.close();
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(de.dfki.reader.Writer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}