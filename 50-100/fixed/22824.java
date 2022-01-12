public boolean saveText(java.lang.String text, java.io.File textFile) {
    try {
        java.io.PrintWriter out = new java.io.PrintWriter(new java.io.FileWriter(textFile));
        out.print(text);
        out.flush();
        out.close();
        return true;
    } catch (java.io.IOException e) {
        com.gabezter4.Vitals.Vitals.log.severe((("Could not save file '" + (textFile.getName())) + "' to plugin data folder."));
        e.printStackTrace();
    }
    return false;
}