public org.mihalis.opal.propertyTable.PropertyTable sort() {
    this.sorted = true;
    this.widget.refillData();
    return this;
}