public void removeShortSoundTrack(int track) {
    mActiveShortSound.removeTrack(mActiveShortSound.getTracks().get(track));
    modelControl.removeTrack(track);
}