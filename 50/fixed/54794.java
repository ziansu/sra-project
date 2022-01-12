private void updateRemoteVideoPosition(long position) {
    castSession.getRemoteMediaClient().seek(position, RemoteMediaClient.RESUME_STATE_UNCHANGED);
}