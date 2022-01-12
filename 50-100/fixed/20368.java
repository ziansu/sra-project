@java.lang.Override
public void OnPlayBegin(java.lang.String path, java.lang.String name, java.lang.String artist) {
    if (musics.get(((musics.size()) - 1)).getPath().equals(path)) {
        isLastSong = true;
    }else {
        isLastSong = false;
    }
}