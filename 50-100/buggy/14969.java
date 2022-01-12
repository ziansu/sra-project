@java.lang.Override
public edu.cmu.ml.rtw.pra.features.PathFollower create(java.util.List<edu.cmu.ml.rtw.pra.features.PathType> pathTypes, edu.cmu.ml.rtw.pra.config.PraConfig config, edu.cmu.ml.rtw.pra.experiments.Dataset data, java.util.List<edu.cmu.ml.rtw.users.matt.util.Pair<edu.cmu.ml.rtw.users.matt.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.Integer>> edgesToExclude) {
    return new edu.cmu.ml.rtw.pra.features.RescalMatrixPathFollower(config.nodeDict.getNextIndex(), pathTypes, rescalDir, data, config.nodeDict, config.edgeDict, config.allowedTargets, edgesToExclude);
}