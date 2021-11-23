public void propagate() {
    this.activate();
    if ((this.next) != null) {
        this.next.setValues(neuronalnetworks.Layer.productMatrixVector(this.weights, this.values));
        this.next.propagate();
    }
}