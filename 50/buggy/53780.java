@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... none) {
    com.ibm.watson.developer_cloud.android.speech_to_text.v1.SpeechToText.sharedInstance().recognize();
    return null;
}