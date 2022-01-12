public void computeZ() {
    double total = 0;
    for (int i = 0; i < (previousLayer.size()); i++) {
        total += ((previousLayer.get(i).activation) * (weights.get(i))) + (bias);
    }
    z = total;
}