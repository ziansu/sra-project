public void setHierarchy(final org.deidentifier.arx.AttributeType.Hierarchy hierarchy) {
    this.hierarchy = (hierarchy == null) ? null : hierarchy.getHierarchy();
    this.table.refresh();
    this.triggerChangedEvent();
}