public double share(Genome g) {
    double sum = 0.1;
    for (int i = 0; i < (genome.size()); i++) {
        double dist = dist(genome.get(i), g);
        if (dist < (distThreshold)) {
            sum++;
        }
    }
    return sum;
}