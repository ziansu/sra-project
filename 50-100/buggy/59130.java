public com.assembla.client.PagedIterator<com.assembla.Ticket> getTicketsByMilestone(java.lang.String milestoneId, com.assembla.service.TicketService.TicketStatusFilter filter) {
    java.lang.String uri = java.lang.String.format(AssemblaConstants.TICKETS_BY_MILESTONE, super.getSpaceId(), milestoneId);
    com.assembla.client.PagedAssemblaRequest request = new com.assembla.client.PagedAssemblaRequest(uri, com.assembla.Ticket[].class);
    request.addParam(AssemblaConstants.TICKET_STATUS_PARAMETER, filter.toString());
    return new com.assembla.client.PagedIterator(request, client);
}