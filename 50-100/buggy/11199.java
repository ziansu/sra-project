public static void generate(java.lang.String bugVecFilePath, java.lang.String codeVecFilePath, java.lang.String simMatFilePath) throws java.lang.Exception {
    int dicSize = config.Config.getInstance().getDicSize();
    java.util.HashMap<java.lang.String, Jama.Matrix> bugVecList = utils.MatrixUtil.loadVectors(bugVecFilePath, dicSize);
    java.util.HashMap<java.lang.String, Jama.Matrix> codeVecList = utils.MatrixUtil.loadVectors(codeVecFilePath, dicSize);
    utils.MatrixUtil.exportSimilarityMatrix(bugVecList, codeVecList, simMatFilePath, dicSize);
}