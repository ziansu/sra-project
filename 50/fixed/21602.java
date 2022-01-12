private void refreshTrack(com.xunce.electrombile.manager.TracksManager.TrackPoint track) {
    currentTrack = track;
    if ((m_context) != null) {
        m_context.dismissWaitDialog();
    }
}