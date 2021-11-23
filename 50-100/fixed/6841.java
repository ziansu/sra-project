@java.lang.Override
public void run() {
    lblLoading.setVisible(true);
    org.magic.api.beans.MagicEdition ed = ((org.magic.api.beans.MagicEdition) (cboEditions.getSelectedItem()));
    modEdition.init(ed);
    try {
        modEdition.fireTableDataChanged();
    } catch (java.lang.Exception e) {
    }
    try {
        table.packAll();
    } catch (java.lang.Exception e) {
    }
    table.setRowSorter(new javax.swing.table.TableRowSorter(modEdition));
    save("EDITION", ed.getId());
    lblLoading.setVisible(false);
}