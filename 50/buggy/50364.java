private boolean isRemoteVideoPlaying() {
    timber.log.Timber.d("VideoDetailsFragment : isRemoteVideoPlaying()");
    if ((castSession) != null) {
        com.google.android.gms.cast.framework.media.RemoteMediaClient remoteMediaClient = castSession.getRemoteMediaClient();
        return remoteMediaClient.isPlaying();
    }
    return false;
}