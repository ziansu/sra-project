@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    findViewById(R.id.control).setBackgroundResource(R.drawable.pause);
    playlist.pause();
    android.util.Log.i("clickList", ("item : " + position));
    playlist.play(position);
    slidingLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
}