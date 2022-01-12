private static boolean saveRunningResult(java.lang.String content, java.lang.String filename) {
    boolean success = false;
    java.io.File file = new java.io.File(filename);
    if (!(file.exists()))
        try {
            success = file.createNewFile();
            java.io.PrintWriter pr = new java.io.PrintWriter(file);
            pr.write(content);
            pr.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    
    return success;
}