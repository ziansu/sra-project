public void detailSelection(javax.swing.JTable table, int row) {
    if (row < 0) {
        javax.swing.JOptionPane.showMessageDialog(com.yaz.vip.util.AppUtil.getInstance().getMainScreenHandle(), "No Item Found", "Search Result", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }else {
        java.lang.System.out.println(("BrowseVolunteer,detailSelection,getValueAt: " + (table.getValueAt(row, 0))));
        com.yaz.vip.util.AppUtil.getInstance().getCenterPanel().setVoluntersPanel(0, table.getValueAt(row, 0).toString());
    }
}