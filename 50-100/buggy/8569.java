@java.lang.Override
public void onSuccess(java.lang.Object response) {
    java.lang.String currentVolume = parseData(((java.lang.String) (response)), "CurrentVolume");
    int iVolume = 0;
    try {
        java.lang.Integer.parseInt(currentVolume);
    } catch (java.lang.RuntimeException ex) {
        ex.printStackTrace();
    }
    float fVolume = ((float) (iVolume / 100.0));
    com.connectsdk.core.Util.postSuccess(listener, fVolume);
}