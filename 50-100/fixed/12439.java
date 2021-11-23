@java.lang.Override
public void dispose() {
    if (isDisposed()) {
        return ;
    }
    _disposed = true;
    getTerminalContext().deleteReferences(terminalContextAndRefs.getRight());
    final de.metas.adempiere.form.terminal.context.TerminalContextFactory terminalContextFactory = de.metas.adempiere.form.terminal.context.TerminalContextFactory.get();
    terminalContextFactory.destroy(getTerminalContext());
}