public void propagate() {
    if ((this.next) != null) {
        this.next.setValues(neuronalnetworks.Layer.productMatrixVector(this.weights, this.values));
        this.next.execute();
    }else
        this.activate();
    
}