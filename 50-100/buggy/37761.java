@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    java.lang.System.out.println(("playing is: " + (playing)));
    if (fromUser && (playing)) {
        android.content.Intent intent = new android.content.Intent(this, person.tevop.mp3player.service.PlayService.class);
        intent.putExtra("state", PlayService.MESSAGE_SKIP);
        intent.putExtra("value", progress);
        startService(intent);
    }
}