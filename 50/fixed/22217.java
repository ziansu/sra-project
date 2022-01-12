public synchronized void addPropertyChangeListener(java.beans.PropertyChangeListener l) {
    if ((_support) == null)
        _support = new java.beans.PropertyChangeSupport(_element);
    
    _support.addPropertyChangeListener(l);
}