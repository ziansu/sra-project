public void SendErrorToUnity(java.lang.String text) {
    if ((m_EngineSR) != null) {
        try {
            if ((com.unity3d.player.UnityPlayer.currentActivity) != null)
                com.unity3d.player.UnityPlayer.UnitySendMessage(tinker.unityplugin.SpeechRecognizerPlugin.myVoiceSetting.game_object, "ReceiveMessageFromAndroid", text);
            
        } catch (java.lang.Exception e) {
            android.util.Log.e(tinker.unityplugin.SpeechRecognizerPlugin.TAG, ("UnitySendMessage failed" + (e.getMessage())));
        }
        m_EngineSR.stopListening();
        stopService(new android.content.Intent(this, tinker.unityplugin.SpeechRecognizerPlugin.class));
    }
    this.onDestroy();
}