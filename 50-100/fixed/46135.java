public void submit() {
    model.Instrument modified;
    java.lang.Integer units;
    modified = new model.Instrument(name, price, description, model, type);
    units = this.stock.getUnits(original);
    this.stock.remove(original);
    try {
        this.stock.add(modified, units);
        this.original = modified;
    } catch (model.StoreError e) {
    }
}