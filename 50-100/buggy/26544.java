private void resetValues(final org.eclipse.swt.widgets.Text key, final org.eclipse.swt.widgets.Text value) {
    final org.talend.core.model.process.IContext context = org.talend.designer.core.ui.editor.properties.ConfigureConnParamDialog.contextManager.getContext(contextCombo.getItem(contextCombo.getSelectionIndex()));
    value.setText(((org.talend.designer.core.ui.editor.properties.ConfigureConnParamDialog.CONTEXT_WITH) + (org.talend.core.model.utils.ContextParameterUtils.parseScriptContextCode(key.getText(), context))));
}