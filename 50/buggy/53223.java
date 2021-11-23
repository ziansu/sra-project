private java.beans.PropertyChangeListener createTableColumnWidthListener() {
    return new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            repaint();
        }
    };
}