private void createWrittenVariableContent(java.util.List<microbat.model.value.VarValue> writtenVariables) {
    this.writtenVariableTreeViewer.setContentProvider(new microbat.views.DebugFeedbackView.RWVariableContentProvider());
    this.writtenVariableTreeViewer.setLabelProvider(new microbat.views.DebugFeedbackView.VariableLabelProvider());
    this.writtenVariableTreeViewer.setInput(writtenVariables);
    setChecks(this.writtenVariableTreeViewer, microbat.views.DebugFeedbackView.RW);
    this.writtenVariableTreeViewer.refresh(true);
}