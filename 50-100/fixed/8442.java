@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((songs) != null) {
        outState.putParcelableArrayList("songs", songs);
        outState.putString("bandName", bandName);
        outState.putInt("position", position);
    }
    if ((mediaPlayer) != null) {
        outState.putDouble("songPosition", timeElapsed);
    }
}