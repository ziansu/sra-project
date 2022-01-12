@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getMainActivity(), com.sandbox.parker.sandbox.song.SongActivity.class);
    intent.putExtra("song", song);
    startActivity(intent);
}