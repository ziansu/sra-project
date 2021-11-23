private com.silverpeas.sharing.model.Ticket checkTicket(java.lang.String token) {
    com.silverpeas.sharing.model.Ticket ticket = com.silverpeas.sharing.services.SharingServiceProvider.getSharingTicketService().getTicket(token);
    if (ticket != null) {
        componentId = ticket.getComponentId();
    }
    if ((ticket == null) || (!(ticket.isValid()))) {
        throw new javax.ws.rs.WebApplicationException(javax.ws.rs.core.Response.Status.UNAUTHORIZED);
    }
    return ticket;
}