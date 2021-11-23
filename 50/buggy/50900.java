@java.lang.Override
public void OnPlayFinished() {
    if (isLastSong) {
        player.stopTVPlayer();
        isLastSong = false;
        getSupportFragmentManager().beginTransaction().hide(player).commitAllowingStateLoss();
    }else {
        player.nextMusic();
    }
}