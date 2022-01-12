private void runEval(ml.shifu.shifu.container.obj.EvalConfig evalConfig) throws java.io.IOException {
    synchronized(this) {
        validateEvalColumnConfig(evalConfig);
        java.lang.String evalSetPath = pathFinder.getEvalSetPath(evalConfig, SourceType.LOCAL);
        org.apache.commons.io.FileUtils.forceMkdir(new java.io.File(evalSetPath));
        syncDataToHdfs(evalConfig.getDataSet().getSource());
    }
    switch (modelConfig.getBasic().getRunMode()) {
        case DIST :
        case MAPRED :
            runDistEval(evalConfig);
            break;
        case LOCAL :
            runAkkaEval(evalConfig);
            break;
        default :
            break;
    }
}