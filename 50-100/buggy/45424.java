@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if ((mReceiver) != null) {
        mReceiver.onReceiveResult(resultCode, resultData);
    }else {
        android.util.Log.w(org.devtcg.rojocam.util.DetachableResultReceiver.TAG, ((("Dropping result on floor for code " + resultCode) + ": ") + (resultData.toString())));
    }
}