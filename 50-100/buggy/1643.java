protected void setResultModel(org.apache.jena.rdf.model.Model resultModel) {
    try {
        resultModelMutex.acquire();
    } catch (java.lang.InterruptedException e) {
        org.hobbit.core.components.AbstractBenchmarkController.LOGGER.error("Interrupted while waiting for the result model mutex. Returning.", e);
    }
    try {
        if (resultModel == null) {
            this.resultModel = resultModel;
        }else {
            this.resultModel.add(resultModel);
        }
    } finally {
        resultModelMutex.release();
    }
    addParametersToResultModel();
}