@java.lang.Override
public void onResponseReceived(org.rstudio.studio.client.workbench.views.environment.dataimport.model.DataImportPreviewResponse response) {
    if ((response.getErrorMessage()) != null) {
        progressIndicator_.onError(response.getErrorMessage());
        return ;
    }
    gridViewer_.setOption("nullsAsNAs", "true");
    gridViewer_.setOption("status", (("Previewing first " + (toLocaleString(maxRows_))) + " entries"));
    gridViewer_.setData(response);
    progressIndicator_.onCompleted();
}