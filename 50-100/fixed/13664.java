@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent e) {
    java.lang.String propName = e.getPropertyName();
    if ("focusOwner".equals(propName)) {
        if ((e.getNewValue()) instanceof javax.swing.JTextField) {
            javax.swing.JTextField textField = ((javax.swing.JTextField) (e.getNewValue()));
            textField.selectAll();
        }
    }else
        if ("value".equals(propName))
            setSaveNeeded(true);
        
    
}