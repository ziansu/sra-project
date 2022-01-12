@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    javax.swing.JTable target = ((javax.swing.JTable) (e.getSource()));
    int row = target.getSelectedRow();
    int column = target.getSelectedColumn();
    visualizeUnfoldingStatistics_Plugin.repaint(historyPN.get(row), false);
}