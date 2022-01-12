public com.SIMRacingApps.Data setVolume(double percentage) {
    synchronized(m_clips) {
        for (int i = 0; i < (m_clips.size()); i++) {
            m_clips.get(i).setVolume(percentage);
        }
    }
    synchronized(m_volume) {
        m_volume = percentage;
    }
    return getVolume();
}