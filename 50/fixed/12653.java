public void insertTicketLine(int index, uk.chromis.pos.ticket.TicketLineInfo oLine) {
    index = index - (offset);
    m_jTableModel.insertRow(index, oLine);
    setSelectedIndex(index);
}