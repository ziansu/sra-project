private void paintTicketLine(int index, uk.chromis.pos.ticket.TicketLineInfo oLine) {
    if ((executeEventAndRefresh("ticket.setline", new uk.chromis.pos.sales.JPanelTicket.ScriptArg("index", index), new uk.chromis.pos.sales.JPanelTicket.ScriptArg("line", oLine))) == null) {
        m_oTicket.setLine(index, oLine);
        m_ticketlines.setTicketLine(index, oLine);
        m_ticketlines.setSelectedIndex(index);
        updatePromotions("promotion.changeline", index, null);
        visorTicketLine(oLine);
        printPartialTotals();
        stateToZero();
        executeEventAndRefresh("ticket.change");
    }
}