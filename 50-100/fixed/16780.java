@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    findViewById(R.id.control).setBackgroundResource(R.drawable.pause);
    playlist.pause();
    playlist.play(position);
    slidingLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
}