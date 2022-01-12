@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    java.lang.String fileName = this.fileUpload.getFilename();
    if ((fileName == null) || (fileName.isEmpty())) {
        setStatusIcon(CommonImages.INSTANCE.error(), true, true);
        errorPanel.setErrorMessage("No file Selected", "Please select a file and then press GO");
        return ;
    }
    if (this.projection.getValue()) {
        form.setAction(org.reactome.web.pwp.client.tools.analysis.submitters.FileSubmitter.FORM_ANALYSIS_PROJECTION);
    }else {
        form.setAction(org.reactome.web.pwp.client.tools.analysis.submitters.FileSubmitter.FORM_ANALYSIS);
    }
    this.form.submit();
}