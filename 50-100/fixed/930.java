@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.lang.String CatContent = ((javax.swing.JComboBox<java.lang.String>) (e.getSource())).getSelectedItem().toString();
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