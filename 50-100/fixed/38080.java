public void init() {
    java.lang.System.out.println("Start audio receive service.");
    int maxJitter = android.media.AudioTrack.getMinBufferSize(16000, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
    track = new android.media.AudioTrack(android.media.AudioManager.STREAM_VOICE_CALL, 16000, android.media.AudioFormat.CHANNEL_OUT_MONO, android.media.AudioFormat.ENCODING_PCM_16BIT, maxJitter, android.media.AudioTrack.MODE_STREAM);
    lin = new byte[1024];
    num = 0;
    am = ((android.media.AudioManager) (this.getSystemService(Context.AUDIO_SERVICE)));
    am.setMode(AudioManager.MODE_IN_COMMUNICATION);
    am.setSpeakerphoneOn(true);
}