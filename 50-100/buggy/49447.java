private static Individual findFittest(double fit) {
    java.lang.System.out.println(("This is the fit score: " + fit));
    Individual fittestIndividual = new Individual();
    for (Individual i : Driver.oldPopulation) {
        java.lang.System.out.println(i.getFitness());
        if ((i.getFitness()) > fit) {
            java.lang.System.out.println(("Replacement Fit Score: " + (i.getFitness())));
            fit = i.getFitness();
            Driver.fittest = i;
        }
    }
    return fittestIndividual;
}