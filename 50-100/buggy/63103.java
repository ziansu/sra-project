private void startAudioTrack() {
    if (((mAudioTrack.getState()) == (android.media.AudioTrack.STATE_INITIALIZED)) && ((mAudioTrack.getPlayState()) == (android.media.AudioTrack.PLAYSTATE_STOPPED))) {
        java.util.ArrayList<android.media.AudioPatch> patches = new java.util.ArrayList<android.media.AudioPatch>();
        mAudioManager.listAudioPatches(patches);
        mAudioTrack.play();
    }
}