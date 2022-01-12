@java.lang.Override
public void run() {
    try {
        int[] selected = table.getSelectedRows();
        java.util.List<org.magic.api.beans.MagicCardStock> stocks = extract(selected);
        model.removeRows(stocks);
        updateCount();
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    lblLoading.setVisible(false);
    updateCount();
}