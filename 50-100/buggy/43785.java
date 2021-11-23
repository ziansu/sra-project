public void stopRec() {
    if ((textdataFileStream) != null) {
        textdataFileStream.close();
        messageListener.haveMessage(AttysComm.MESSAGE_STOPPED_RECORDING);
        textdataFileStream = null;
        if ((textdataFile) != null) {
            android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
            android.net.Uri contentUri = android.net.Uri.fromFile(textdataFile);
            mediaScanIntent.setData(contentUri);
            sendBroadcast(mediaScanIntent);
        }
        textdataFile = null;
    }
}