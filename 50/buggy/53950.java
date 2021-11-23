@org.junit.Test
public void prismHeuristicPasses() {
    gov.usgs.cida.gdp.wps.algorithm.heuristic.GeometrySizeAlgorithmHeuristic geometrySizeHeuristic = new gov.usgs.cida.gdp.wps.algorithm.heuristic.GeometrySizeAlgorithmHeuristic(coloradoFeatureCollection, false);
    geometrySizeHeuristic.traverseStart(prismGridDataSet.getGrids().get(0));
}