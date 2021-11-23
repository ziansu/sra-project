private boolean needsValidationViewReset(org.obiba.opal.web.model.client.magma.TableDto newTable) {
    if (((table) == null) || ((this.table) == null)) {
        return true;
    }
    if (!(table.getName().equals(this.table.getName()))) {
        return true;
    }
    if (!(table.getDatasourceName().equals(this.table.getDatasourceName()))) {
        return true;
    }
    return false;
}