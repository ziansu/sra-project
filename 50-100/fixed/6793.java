@java.lang.Override
protected void saveContext() {
    org.talend.dataquality.analysis.Analysis analysis = getAnalysis();
    org.talend.core.model.process.IContextManager contextManager = currentEditor.getContextManager();
    contextManager.saveToEmf(analysis.getContextType());
    analysis.setDefaultContext(getDefaultContextGroupName(((org.talend.dataprofiler.core.ui.editor.SupportContextEditor) (currentEditor))));
    org.talend.dataquality.helpers.AnalysisHelper.setLastRunContext(currentEditor.getLastRunContextGroupName(), analysis);
}