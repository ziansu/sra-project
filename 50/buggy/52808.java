public boolean importParameters(pl.edu.agh.pea.Core.ProblemParameters pp) {
    return pl.edu.agh.pea.Core.ParametersFromFile.readConfigFile(fileName, pp);
}