public void sendData(org.md2k.datakitapi.datatype.DataTypeDoubleArray dataType) {
    try {
        org.md2k.datakitapi.DataKitAPI.getInstance(context).insertHighFrequency(dataSourceClient, dataType);
    } catch (org.md2k.datakitapi.exception.DataKitException e) {
        android.content.Intent intentRestart = new android.content.Intent("microsoftband_stop");
        android.support.v4.content.LocalBroadcastManager.getInstance(context).sendBroadcast(intentRestart);
        android.widget.Toast.makeText(context, "Send Data Error", Toast.LENGTH_SHORT).show();
        e.printStackTrace();
    }
}