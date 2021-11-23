public void insertTicketLine(int index, uk.chromis.pos.ticket.TicketLineInfo oLine) {
    m_jTableModel.insertRow(index, oLine);
    setSelectedIndex(index);
}