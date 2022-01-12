@java.lang.Override
public void run() {
    for (org.zack.music.Music music : musics) {
        music.setModel(org.zack.music.Music.getAlbumByte(music.getPath()));
    }
    if ((getActivity()) != null) {
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                listAdapter.notifyDataSetChanged();
            }
        });
    }
}