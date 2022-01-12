private void jComboBox_fitmethodPropertyChange(java.beans.PropertyChangeEvent evt) {
    javax.swing.JComboBox combo = ((javax.swing.JComboBox) (evt.getSource()));
    int ind = combo.getSelectedIndex();
    switch (ind) {
        case 0 :
            fitmethod = "2DG";
            break;
        case 1 :
            fitmethod = "centroid";
            break;
        case 2 :
            fitmethod = "1DG";
            break;
    }
}