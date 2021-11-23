public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    int r;
    org.openelis.domain.AnalysisQaEventViewDO data;
    r = analysisQATable.getSelectedRow();
    if (r < 0)
        return ;
    
    data = analysisQAManager.getAnalysisQAAt(r);
    window.clearStatus();
    if (!(canEditAnalysisQA(data.getTypeId())))
        window.setError(consts.get("cantUpdateAnalysisQAEvent"));
    else
        analysisQATable.deleteRow(r);
    
}