private boolean saveText(java.lang.String[] lines, java.io.File textFile) {
    try {
        java.io.PrintWriter out = new java.io.PrintWriter(new java.io.FileWriter(textFile));
        for (java.lang.String line : lines)
            out.println(line);
        
        out.flush();
        out.close();
        return true;
    } catch (java.io.IOException e) {
        com.gabezter4.Vitals.Vitals.log.severe((("Could not save file '" + (textFile.getName())) + "' to plugin data folder."));
        e.printStackTrace();
    }
    return false;
}