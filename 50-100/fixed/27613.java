protected void pauseRecord() {
    recorder.stop();
    recorder.release();
    java.io.File tempFile = new java.io.File(strTempVideoPath);
    if (tempFile.exists()) {
        com.github.lassana.recorder.Mp4ParserWrapper.append(strVideoPath, strTempVideoPath);
        tempFile.delete();
    }
}