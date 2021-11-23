@java.lang.Override
public void receive(audio.squelch.SquelchState state) {
    audio.AudioModule.mLog.debug(("Squelch State:" + state));
    if ((state == (audio.squelch.SquelchState.SQUELCH)) && ((mAudioPacketListener) != null)) {
        mAudioPacketListener.receive(new audio.AudioPacket(AudioPacket.Type.END, mAudioMetadata.copyOf()));
    }
    mSquelchState = state;
}