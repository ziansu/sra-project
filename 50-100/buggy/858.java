@java.lang.Override
public void dragFinished(final org.eclipse.swt.dnd.DragSourceEvent event) {
    if ((event.detail) == (org.eclipse.swt.dnd.DND.DROP_MOVE)) {
        final org.eclipselabs.e4.tapiji.translator.ui.treeviewer.provider.TreeViewerContentProvider contentProvider = ((org.eclipselabs.e4.tapiji.translator.ui.treeviewer.provider.TreeViewerContentProvider) (source.getContentProvider()));
        final org.eclipselabs.e4.tapiji.translator.model.Glossary glossary = contentProvider.getGlossary();
        for (final org.eclipselabs.e4.tapiji.translator.model.Term selectionObject : selectionList) {
            glossary.removeTerm(selectionObject);
        }
        this.glossaryService.updateGlossary(glossary);
        this.source.refresh();
    }
}