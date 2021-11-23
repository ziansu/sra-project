private com.alphatica.genotick.genotick.Population wirePopulation(com.alphatica.genotick.genotick.MainSettings settings) {
    com.alphatica.genotick.genotick.PopulationDAO dao = com.alphatica.genotick.genotick.PopulationDAOFactory.getDefaultDAO(settings.populationDAO);
    com.alphatica.genotick.genotick.Population population = com.alphatica.genotick.genotick.PopulationFactory.getDefaultPopulation(dao);
    population.setDesiredSize(settings.populationDesiredSize);
    return population;
}