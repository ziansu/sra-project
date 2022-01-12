@java.lang.Override
public void onClick(android.view.View view) {
    if ((player) != null) {
        player.setPlayWhenReady((!(player.getPlayWhenReady())));
    }
}