private void newRecordText(java.lang.String filePath) {
    try {
        java.io.FileWriter writer = new java.io.FileWriter(filePath);
        writer.close();
        gameRecord = true;
    } catch (java.io.IOException e) {
        gameRecord = false;
    }
}