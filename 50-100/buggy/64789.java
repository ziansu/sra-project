public void outputStream(java.io.File outputFile, java.lang.String ToWrite, boolean append) {
    fileOutputStream = null;
    try {
        fileOutputStream = new java.io.FileOutputStream(outputFile, append);
        fileOutputStream.write(ToWrite.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}