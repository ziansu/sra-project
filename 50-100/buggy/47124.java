@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.telephony.TelephonyManager mgr = ((android.telephony.TelephonyManager) (this.getSystemService(edu.mit.to_string.TELEPHONY_SERVICE)));
    java.lang.String imei = mgr.getDeviceId();
    java.lang.String[] array = new java.lang.String[1];
    array[1] = imei;
    java.lang.String arrayToString = java.util.Arrays.toString(array);
    android.util.Log.i("DroidBench", arrayToString);
}