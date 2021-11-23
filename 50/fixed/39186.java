public static void calculateFitness(double average) {
    for (Individual i : Driver.oldPopulation) {
        i.setFitness((((double) (i.getEvaluation())) / (java.lang.Math.abs(average))));
    }
}