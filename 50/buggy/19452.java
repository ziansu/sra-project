private void refreshThreshold() {
    final com.backyardbrains.audio.AudioService provider = getAudioService();
    if (provider != null)
        getRenderer().refreshThreshold();
    
}