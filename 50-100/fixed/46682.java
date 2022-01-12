private void writeLogToFile(java.lang.String log, java.io.File file, boolean append) throws java.io.IOException {
    try {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(file, append);
        fos.write(log.getBytes());
        fos.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
        file.getParentFile().mkdirs();
    } catch (java.io.IOException e) {
        throw e;
    }
}