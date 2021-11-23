public void propertyChange(java.beans.PropertyChangeEvent e) {
    if (e.getPropertyName().equals("length")) {
        fireTableDataChanged();
    }else
        if (e.getPropertyName().equals("routing")) {
            fireTableDataChanged();
        }else
            if (matchPropertyName(e)) {
                int row = ((java.lang.Integer) (e.getNewValue()));
                fireTableRowsUpdated(row, row);
            }
        
    
}