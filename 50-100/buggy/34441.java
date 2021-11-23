public theater.Ticket sellTicket(theater.Member member, theater.Show show, theater.CreditCard card, int ticketType, java.util.Calendar showDate) {
    theater.Ticket ticket = createTicket(showDate, show, ticketType);
    theater.Transaction transaction = new theater.Transaction(show, member, ticket, card);
    transactions.add(transaction);
    member.addTicket(ticket);
    show.indicateSell();
    return ticket;
}