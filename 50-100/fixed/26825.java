public void ga() {
    for (int i = 0; i < (numberGenerations); i++) {
        generatePopulation();
        fitness();
        crossover();
        mutation();
        if (isFoundSolution()) {
            java.lang.System.out.println(i);
            break;
        }
        survivers();
    }
}