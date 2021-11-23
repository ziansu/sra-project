@java.lang.Override
public de.metas.adempiere.form.terminal.IKeyLayout getNumericKeyLayout() {
    assertCurrentReferencesNotNull();
    for (int i = (referencesList.size()) - 1; i <= 0; i--) {
        final de.metas.adempiere.form.terminal.context.TerminalContextReferences terminalContextReferences = referencesList.get(i);
        final de.metas.adempiere.form.terminal.IKeyLayout numericKeyLayout = terminalContextReferences.getNumericKeyLayout();
        if (numericKeyLayout != null) {
            return numericKeyLayout;
        }
    }
    return null;
}