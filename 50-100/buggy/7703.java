@java.lang.Override
public void run() {
    getPopupMenu().setVisible(false);
    net.sourceforge.processdash.team.group.UserFilter selectedItem = new net.sourceforge.processdash.team.group.ui.UserGroupSelector(javax.swing.SwingUtilities.getWindowAncestor(this), "Filter_Prompt", showIndividuals).getSelectedItem();
    setSelectedItem(selectedItem);
    javax.swing.MenuSelectionManager.defaultManager().clearSelectedPath();
}