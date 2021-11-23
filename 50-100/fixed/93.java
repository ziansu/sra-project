public void Propagate() {
    double z = 0;
    for (com.thunkar.grrow.model.brain.Connection c : this.Connections) {
        z += (c.getInput().getValue()) * (c.getWeight());
    }
    this.value = 1 / (1 + ((float) (java.lang.Math.pow(((float) (java.lang.Math.E)), ((-z) + 1)))));
}