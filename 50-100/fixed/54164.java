@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.freedom.freeclient.freeclient.ConnectActivity.SETTINGS_REQUEST)) {
        if (resultCode == (RESULT_OK)) {
            final java.util.Properties props = com.freedom.freeclient.freeclient.util.Util.getProperties(com.freedom.freeclient.freeclient.util.Config.getInfoFilePath());
            new com.freedom.freeclient.freeclient.ConnectActivity.CreateConnection(props).execute(1);
        }
    }
}