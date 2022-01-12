@br.com.caelum.vraptor.Get(value = "/ticket/visualizar/{codigo}")
public void visualizarTicket(java.lang.Integer ticket) {
    result.include("ticket", ticketDao.pesquisarTicket(ticket));
}