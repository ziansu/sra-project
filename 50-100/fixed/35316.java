public boolean LogError(java.lang.String content) {
    if (createLogFile()) {
        java.io.FileWriter writer;
        try {
            writer = new java.io.FileWriter(getGPSLogPath(), true);
            writer.write(content);
            writer.close();
            writer = null;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return true;
}