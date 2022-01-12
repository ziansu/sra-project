public boolean addEpisode(@android.support.annotation.NonNull
org.bottiger.podcast.provider.IEpisode argEpisode, boolean argSilent) {
    if (contains(argEpisode))
        return false;
    
    mEpisodes.add(argEpisode);
    if (!argSilent)
        notifyEpisodeAdded(true);
    
    return true;
}