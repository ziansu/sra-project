@java.lang.Override
public void onAnalysisError(org.reactome.web.pwp.client.tools.analysis.event.AnalysisErrorEvent event) {
    if (event != null) {
        org.reactome.web.pwp.client.common.analysis.model.AnalysisError error = event.getAnalysisError();
        errorPanel.setErrorMessage(error);
    }
    setStatusIcon(null, false);
}