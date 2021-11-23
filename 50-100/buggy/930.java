@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String CatContent = ((java.lang.String) (((javax.swing.JComboBox<java.lang.String>) (e.getSource())).getSelectedItem()));
    if ((dm) != null) {
        if ((CatContent.length()) > 0) {
            dm.SetCategoryFilter(CatContent);
        }else {
            dm.EraseCategoryFilter();
        }
        dm.ResetModell();
        dm.fireTableDataChanged();
    }
}