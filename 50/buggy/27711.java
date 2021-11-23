@java.lang.Override
public void onError(java.lang.String s) {
    android.util.Log.e(org.kiwix.kiwixmobile.utils.KiwixTextToSpeech.TAG_KIWIX, ("TextToSpeech: " + s));
    stop();
}