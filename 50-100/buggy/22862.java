@org.junit.Test
public void getTicketByMilestoneWithTicketFilterTest() {
    com.assembla.client.PagedIterator<com.assembla.Ticket> tickets = ticketService.getTicketsByMilestone("123", TicketStatusFilter.ALL);
    com.assembla.client.PagedAssemblaRequest request = new com.assembla.client.PagedAssemblaRequest("/spaces/test_space_id/tickets/milestone/123.json", com.assembla.Ticket[].class);
    request.addParam(AssemblaConstants.TICKET_STATUS_PARAMETER, TicketStatusFilter.ALL.toString());
    org.junit.Assert.assertEquals(request, tickets.getRequest());
}