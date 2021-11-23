public void save(java.lang.Integer id, java.lang.String name, java.lang.Double price, java.lang.Double quantity, com.unq.estip.pada.model.Unit unit) {
    com.unq.estip.pada.model.Product p = (com.unq.estip.pada.utils.Utilities.isVariableSet(id)) ? productDAO.findById(id) : new com.unq.estip.pada.model.Product();
    p.setName(name);
    p.setPrice(price);
    p.setQuantity(quantity);
    p.setUnit(unit);
    this.productDAO.save(p);
}