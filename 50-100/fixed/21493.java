@java.lang.SuppressWarnings(value = "unchecked")
public void setRowFilter(javax.swing.RowFilter<de.jClipCorn.gui.frames.mainFrame.clipTable.ClipTableModel, java.lang.Object> filter, de.jClipCorn.gui.frames.mainFrame.clipTable.RowFilterSource source) {
    if (source != (RowFilterSource.CHARSELECTOR)) {
        owner.resetCharSelector();
    }
    if (source != (RowFilterSource.SIDEBAR)) {
        owner.resetSidebar();
    }
    if (source != (RowFilterSource.TEXTFIELD)) {
        owner.resetSearchField(true);
    }
    ((javax.swing.table.TableRowSorter<de.jClipCorn.gui.frames.mainFrame.clipTable.ClipTableModel>) (table.getRowSorter())).setRowFilter(filter);
    owner.getStatusBar().updateLables_Movies();
}