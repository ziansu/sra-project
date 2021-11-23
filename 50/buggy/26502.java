public genetic.Population best(int n) {
    return new genetic.Population(this.subList((((this.size()) - 1) - n), ((this.size()) - 1)), sqE);
}