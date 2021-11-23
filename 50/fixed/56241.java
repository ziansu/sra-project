public com.SIMRacingApps.Data setVolume(double percentage) {
    if ((m_clip) != null)
        synchronized(m_clip) {
            m_clip.setVolume(percentage);
        }
    
    synchronized(m_volume) {
        m_volume = percentage;
    }
    return getVolume();
}