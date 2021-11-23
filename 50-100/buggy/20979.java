@java.lang.Override
public void positionSource(int line, int position) {
    try {
        final org.jkiss.dbeaver.ui.editors.sql.IRegion lineInfo = org.jkiss.dbeaver.ui.editors.sql.SQLEditorNested.getTextViewer().getDocument().getLineInformation((line - 1));
        final int offset = ((lineInfo.getOffset()) + position) - 1;
        super.selectAndReveal(offset, 0);
    } catch (org.jkiss.dbeaver.ui.editors.sql.BadLocationException e) {
        log.warn(e);
    }
}