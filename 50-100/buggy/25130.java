@java.lang.Override
public void run() {
    for (org.zack.music.Music music : musics) {
        music.setModel(org.zack.music.Music.getAlbumByte(music.getPath()));
    }
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            listAdapter.notifyDataSetChanged();
        }
    });
}