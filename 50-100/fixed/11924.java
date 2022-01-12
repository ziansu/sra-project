private void outputToFile(java.lang.String text) {
    java.lang.String id = xaurora.io.IDGenerator.instanceOf().GenerateID(xaurora.communication.ChromeServer.getURL(text), xaurora.communication.ChromeServer.TYPE_FULL_TEXT);
    xaurora.io.DataFileIO.instanceOf().createDataFile(id, java.lang.String.valueOf(text).getBytes());
    java.lang.System.out.println(java.lang.String.valueOf(text));
}