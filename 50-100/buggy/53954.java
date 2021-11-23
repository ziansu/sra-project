protected void createComboColumn(org.miradi.objects.BaseObject[] content, int tableColumn, org.miradi.objects.BaseObject invalidObject) {
    java.util.Arrays.sort(content, new org.miradi.dialogs.base.EditableBaseObjectTable.SorterByToString());
    java.util.Vector<org.miradi.questions.ChoiceItem> comboContent = addEmptySpaceAtStart(content, invalidObject);
    org.miradi.dialogs.tablerenderers.DefaultFontProvider fontProvider = new org.miradi.dialogs.tablerenderers.DefaultFontProvider(getMainWindow());
    org.miradi.dialogs.tablerenderers.ChoiceItemComboBoxRendererOrEditorFactory renderer = new org.miradi.dialogs.tablerenderers.ChoiceItemComboBoxRendererOrEditorFactory(model, fontProvider, comboContent);
    setPlainRendererAndEditorFactories(tableColumn, renderer, renderer);
}