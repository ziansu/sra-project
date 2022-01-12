@java.lang.Override
public void onRenameShortSoundTrack(java.lang.String inputText, int track) {
    if ((!(inputText.matches("\\s+"))) && (!(inputText.equals("")))) {
        mActiveShortSound.getTracks().get(track).saveTrackName(inputText);
        ((com.sloths.speedy.shortsounds.view.TrackList) (animator.getChildAt(viewMap.get(com.sloths.speedy.shortsounds.view.MainActivity.TRACKS)).findViewById(R.id.track_list))).notifyTrackNameChanged(track);
    }
}