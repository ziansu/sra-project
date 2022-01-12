public double averagePopulation() {
    double average;
    long total = 0;
    for (int i = 0; i < (population.size()); i++) {
        total += population.get(i).getEvaluation();
    }
    average = total / (population.size());
    return average;
}