public synchronized void addPropertyChangeListener(java.beans.PropertyChangeListener l) {
    if ((_support) == null) {
        synchronized(this) {
            if ((_support) == null)
                _support = new java.beans.PropertyChangeSupport(this);
            
        }
    }
    _support.addPropertyChangeListener(l);
}