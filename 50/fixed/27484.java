@java.lang.Override
public boolean remove(final java.lang.Object key, final java.lang.Object value) {
    synchronized(m_lock) {
        return m_data.remove(key, value);
    }
}