public edu.ncsu.csc.Galant.algorithm.Intger unmarkedDegree(edu.ncsu.csc.Galant.graph.component.Node v) throws edu.ncsu.csc.Galant.GalantException {
    return unmarkedNeighbors(v).size();
}