public static java.util.List<org.jgap.IChromosome> crossOverPopulation(java.util.List<org.jgap.Chromosome> listPopulation, java.util.List<org.jgap.Chromosome> list) throws org.jgap.InvalidConfigurationException {
    br.unifor.iadapter.genetic.GeneWorkLoad.getConfiguration().setPopulationSize(listPopulation.size());
    java.util.List<org.jgap.IChromosome> newlist = new java.util.ArrayList<org.jgap.IChromosome>();
    br.unifor.iadapter.genetic.CrossoverOperator cs = new br.unifor.iadapter.genetic.CrossoverOperator(br.unifor.iadapter.genetic.GeneWorkLoad.getConfiguration(), 1);
    newlist = cs.operateBestIndividuals(listPopulation, list);
    return newlist;
}