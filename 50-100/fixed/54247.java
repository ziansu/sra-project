private boolean needsValidationViewReset(org.obiba.opal.web.model.client.magma.TableDto newTable) {
    if ((newTable == null) || ((this.table) == null)) {
        return true;
    }
    if (!(newTable.getName().equals(this.table.getName()))) {
        return true;
    }
    if (!(newTable.getDatasourceName().equals(this.table.getDatasourceName()))) {
        return true;
    }
    return false;
}