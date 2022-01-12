@org.junit.Test(expected = gov.usgs.cida.gdp.wps.algorithm.heuristic.exception.AlgorithmHeuristicException.class)
public void prismHeuriticFails() {
    gov.usgs.cida.gdp.wps.algorithm.heuristic.GeometrySizeAlgorithmHeuristic geometrySizeHeuristic = new gov.usgs.cida.gdp.wps.algorithm.heuristic.GeometrySizeAlgorithmHeuristic(coloradoFeatureCollection, false, 100, 1024);
}