@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if (javax.swing.SwingUtilities.isLeftMouseButton(e))
        ((gui.mainscreen.searchbar.SearchPanel) (getParent().getParent())).selectSuggestion();
    
}