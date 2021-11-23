@java.lang.Override
public edu.cmu.tetrad.graph.Graph createGraph(edu.cmu.tetrad.util.Parameters parameters) {
    return edu.cmu.tetrad.graph.GraphUtils.randomGraphRandomForwardEdges(parameters.getInt("numMeasures"), parameters.getInt("numLatents"), (((parameters.getInt("avgDegree")) * (parameters.getInt("numMeasures"))) / 2), parameters.getInt("maxDegree"), parameters.getInt("maxIndegree"), parameters.getInt("maxOutdegree"), parameters.getBoolean("connected"));
}