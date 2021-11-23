public void removeSoundClips() {
    java.util.List<SoundClip> l = view.getSelectedSoundClips();
    Album selectedAlbum = view.getSelectedAlbum();
    if (selectedAlbum != null) {
    }else {
        selectedAlbum = root;
    }
    for (int i = 0; i < (l.size()); i++) {
        selectedAlbum.removeSoundClip(l.get(i));
    }
    view.onClipsUpdated();
}