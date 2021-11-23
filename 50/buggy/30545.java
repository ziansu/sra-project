@br.com.caelum.vraptor.Post(value = "/ticket/visualizar/{ticket.codigo}")
public void visualizarTicket(br.edu.fema.sacheti.model.Ticket ticket) {
    result.include("ticket", ticketDao.pesquisarTicket(ticket));
}