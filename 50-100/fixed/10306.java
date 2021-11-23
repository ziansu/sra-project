@java.lang.Override
public void onClick(android.view.View view) {
    if (!(mInteractivePlayerView.isPlaying())) {
        mInteractivePlayerView.start();
        fab.setImageResource(R.drawable.ic_action_pause);
    }else {
        mInteractivePlayerView.stop();
        fab.setImageResource(R.drawable.ic_action_play);
    }
}