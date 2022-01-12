public com.SIMRacingApps.Data getVolume() {
    double volume = 0.0;
    synchronized(m_clips) {
        if ((m_clips.size()) > 0)
            volume = m_clips.get(0).getVolume();
        
    }
    return new com.SIMRacingApps.Data("", (volume * 100.0), "%", Data.State.NORMAL);
}