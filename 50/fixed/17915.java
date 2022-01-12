public void assignWeight(float weight, int index) {
    if (index >= (weights.size())) {
        weights.add(weight);
    }else {
        weights.set(index, weight);
    }
}