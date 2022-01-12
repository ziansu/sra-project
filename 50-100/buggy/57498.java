@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mBTAdapter[0].cancelDiscovery();
    mBTAdapter[1].cancelDiscovery();
    try {
        mBTSocket[0].close();
        mBTSocket[1].close();
    } catch (java.lang.Exception e) {
        android.util.Log.d("Error", e.toString());
    }
    net.daum.mf.speech.api.SpeechRecognizerManager.getInstance().finalizeLibrary();
}