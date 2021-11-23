public genetic.Population best(int n) {
    return new genetic.Population(this.subList(((this.size()) - n), ((this.size()) - 1)), sqE);
}