protected boolean isActive() {
    synchronized(this) {
        return m_active;
    }
}