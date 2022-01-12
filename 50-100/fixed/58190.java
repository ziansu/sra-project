@java.lang.Override
public edu.cmu.tetrad.graph.Graph createGraph(edu.cmu.tetrad.util.Parameters parameters) {
    return edu.cmu.tetrad.graph.GraphUtils.scaleFreeGraph(((parameters.getInt("numMeasures")) + (parameters.getInt("numLatents"))), parameters.getInt("numLatents"), parameters.getDouble("scaleFreeAlpha"), parameters.getDouble("scaleFreeBeta"), parameters.getDouble("scaleFreeDeltaIn"), parameters.getDouble("scaleFreeDeltaOut"));
}