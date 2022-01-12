@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && (playing)) {
        android.content.Intent intent = new android.content.Intent(this, person.tevop.mp3player.service.PlayService.class);
        intent.putExtra("state", PlayService.MESSAGE_SKIP);
        intent.putExtra("value", progress);
        startService(intent);
    }
}