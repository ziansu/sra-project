@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mBTAdapter.cancelDiscovery();
    try {
        if ((mBTSocket[0]) != null)
            mBTSocket[0].close();
        
        if ((mBTSocket[1]) != null)
            mBTSocket[1].close();
        
    } catch (java.lang.Exception e) {
        android.util.Log.d("Error", e.toString());
    }
    net.daum.mf.speech.api.SpeechRecognizerManager.getInstance().finalizeLibrary();
}