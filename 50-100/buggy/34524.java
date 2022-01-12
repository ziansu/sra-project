private void setParameters(pl.nask.hsn2.wrappers.ParametersWrapper parameters) {
    try {
        java.lang.String mKeywords = parameters.get("keywords_malicious");
        if (mKeywords != null)
            maliciousKeywords = mKeywords;
        
    } catch (pl.nask.hsn2.RequiredParameterMissingException e) {
        pl.nask.hsn2.service.JsAnalyzerTask.LOGGER.debug("Used default malicious keywords");
    }
    try {
        java.lang.String sKeywords = parameters.get("keywords_suspicious");
        if (sKeywords != null)
            suspiciousKeywords = sKeywords;
        
    } catch (pl.nask.hsn2.RequiredParameterMissingException e) {
        pl.nask.hsn2.service.JsAnalyzerTask.LOGGER.debug("Used default suspicious keywords");
    }
}