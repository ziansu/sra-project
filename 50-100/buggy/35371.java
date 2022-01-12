private void writeResult(java.lang.String result) {
    java.io.File f = new java.io.File(LOGFILEPATH);
    try {
        java.io.FileWriter writer = new java.io.FileWriter(f);
        writer.write(result);
        writer.flush();
        writer.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}