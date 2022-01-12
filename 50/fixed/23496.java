public boolean invoiceExists(int id) {
    entities.core.Invoice invoice = invoiceDao.findOne(id);
    if (invoice != null)
        return (invoice.getId()) == id;
    
    return false;
}