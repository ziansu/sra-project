@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int i = tab.getSelectedRow();
    if (i >= 0) {
        visualizeUnfoldingStatistics_Plugin.repaint(historyPN.get(i), false);
    }
}