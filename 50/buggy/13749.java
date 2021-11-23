@java.lang.Override
public void receive(audio.AudioEvent event) {
    switch (event.getType()) {
        case AUDIO_STARTED :
            mAudioStoppedTime = java.lang.Long.MAX_VALUE;
            break;
        case AUDIO_STOPPED :
            mAudioStoppedTime = java.lang.System.currentTimeMillis();
            break;
        default :
            break;
    }
}