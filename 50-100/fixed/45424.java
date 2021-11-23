@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if ((mReceiver) != null) {
        mReceiver.onReceiveResult(resultCode, resultData);
    }else {
        java.lang.StringBuilder b = new java.lang.StringBuilder();
        b.append(("Dropping result on floor for code " + resultCode));
        if (resultData != null) {
            b.append(": ");
            b.append(resultData.toString());
        }
        android.util.Log.w(org.devtcg.rojocam.util.DetachableResultReceiver.TAG, b.toString());
    }
}