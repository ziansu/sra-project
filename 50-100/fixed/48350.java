public void initPopulation() {
    for (int i = 0; i < (individuals); i++) {
        Triangle[] triangleList = new Triangle[triangles];
        for (int j = 0; j < (triangles); j++) {
            triangleList[j] = getRandomTriangle();
        }
        population[i] = new Individual(triangleList, Solver.file.blank, 0);
    }
    java.lang.System.out.println((("Created population with " + (individuals)) + " individuals!"));
}