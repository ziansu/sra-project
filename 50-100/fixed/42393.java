public void clearTransferredPoints() {
    java.io.FileOutputStream outputStream;
    java.lang.String text = "";
    try {
        outputStream = openFileOutput(transferredFilename, Context.MODE_PRIVATE);
        outputStream.write(text.getBytes());
        outputStream.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}