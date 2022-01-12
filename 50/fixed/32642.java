protected void doSetCustomer(com.floreantpos.model.Customer customer) {
    ticket.setCustomer(customer);
    setCanceled(false);
    dispose();
}