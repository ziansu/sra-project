protected void doSetCustomer(com.floreantpos.model.Customer customer) {
    ticket.setCustomer(customer);
    com.floreantpos.model.dao.TicketDAO.getInstance().saveOrUpdate(ticket);
    setCanceled(false);
    dispose();
}