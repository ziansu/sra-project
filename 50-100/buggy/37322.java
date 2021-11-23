public java.util.Optional<com.iluwatar.hexagonal.domain.LotteryTicketId> submitTicket(com.iluwatar.hexagonal.domain.LotteryTicket ticket) {
    boolean result = wireTransfers.transferFunds(LotteryConstants.TICKET_PRIZE, ticket.getPlayerDetails().getBankAccount(), LotteryConstants.SERVICE_BANK_ACCOUNT);
    if (result == false) {
        notifications.ticketSubmitError(ticket.getPlayerDetails());
        return java.util.Optional.empty();
    }
    java.util.Optional<com.iluwatar.hexagonal.domain.LotteryTicketId> optional = repository.save(ticket);
    if (optional.isPresent()) {
        notifications.ticketSubmitted(ticket.getPlayerDetails());
    }
    return optional;
}