private void outputToFile(java.lang.String text) {
    byte[] id = xaurora.io.IDGenerator.instanceOf().GenerateID(xaurora.communication.ChromeServer.getURL(text), xaurora.communication.ChromeServer.TYPE_FULL_TEXT);
    xaurora.io.DataFileIO.instanceOf().createDataFile(id, java.lang.String.valueOf(text).getBytes());
}