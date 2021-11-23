public boolean invoiceExists(int id) {
    entities.core.Invoice invoice = invoiceDao.findOne(id);
    return (invoice.getId()) == id;
}