public boolean toggle(@android.support.annotation.NonNull
org.bottiger.podcast.provider.IEpisode argEpisode) {
    org.bottiger.podcast.provider.IEpisode item = getCurrentItem();
    if ((!(mPlayer.isPlaying())) || ((item != null) && (!(argEpisode.getUrl().equals(item.getUrl()))))) {
        play(argEpisode.getUrl().toString());
        return true;
    }else {
        pause();
        return false;
    }
}