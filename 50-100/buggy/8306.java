public double averagePopulation() {
    double average;
    long total = 0;
    for (int i = 0; i < (population.size()); i++) {
        total += population.get(i).getEvaluation();
    }
    java.lang.System.out.println(("Evalutation Total: " + total));
    average = total / (population.size());
    return average;
}