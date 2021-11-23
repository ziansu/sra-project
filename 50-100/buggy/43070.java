@java.lang.Override
public void onResponseReceived(org.rstudio.studio.client.workbench.views.environment.dataimport.model.DataImportAssembleResponse response) {
    if ((response.getErrorMessage()) != null) {
        progressIndicator_.onError(response.getErrorMessage());
        return ;
    }
    codePreview_ = response.getImportCode();
    dataImportOptionsUi_.setAssembleResponse(response);
    localFiles_ = response.getLocalFiles();
    setCodeAreaDefaults();
    codeArea_.setCode(codePreview_);
    if (onComplete != null) {
        onComplete.execute();
    }
}