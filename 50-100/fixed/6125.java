public void removeTicketLine(int i) {
    i = i - (offset);
    m_jTableModel.removeRow(i);
    if (i >= (m_jTableModel.getRowCount())) {
        i = (m_jTableModel.getRowCount()) - 1;
    }
    if ((i >= 0) && (i < (m_jTableModel.getRowCount()))) {
        setSelectedIndex(i);
    }
}