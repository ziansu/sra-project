@java.lang.Override
public edu.cmu.ml.rtw.pra.features.FeatureMatrix getFeatureMatrix() {
    edu.cmu.ml.rtw.pra.features.RescalMatrixPathFollower.logger.info("Creating feature matrix with matrix multiplication");
    edu.cmu.ml.rtw.pra.features.RescalPathMatrixCreator matrixCreator = new edu.cmu.ml.rtw.pra.features.RescalPathMatrixCreator(numNodes, pathTypes, data.getCombinedSourceMap().keySet(), rescalDir, nodeDict, edgeDict, negativesPerSource, fileUtil);
    return matrixCreator.getFeatureMatrix(data.getCombinedSourceMap().keySet(), allowedTargets, false);
}