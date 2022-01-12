@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_music_controller);
    songName = ((android.widget.TextView) (findViewById(R.id.textView4)));
    playButton = ((android.widget.ImageButton) (findViewById(R.id.imageButton1)));
    pauseButton = ((android.widget.ImageButton) (findViewById(R.id.imageButton2)));
    pauseButton.setEnabled(true);
    playButton.setEnabled(false);
    songName.setText(SearchFragment.adapter.getItem(SearchFragment.currentPosition).getName());
}