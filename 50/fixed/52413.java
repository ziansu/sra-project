public void setTicketLine(int index, uk.chromis.pos.ticket.TicketLineInfo oLine) {
    index = index - (offset);
    m_jTableModel.setRow(index, oLine);
}