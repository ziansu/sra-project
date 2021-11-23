protected void updateComputedColumn(java.lang.Object structureOrHandle) {
    if (structureOrHandle instanceof org.eclipse.birt.report.model.api.elements.structures.ComputedColumn) {
        try {
            computedColumns.addItem(((org.eclipse.birt.report.model.api.elements.structures.ComputedColumn) (structureOrHandle)));
            viewer.getViewer().refresh();
        } catch (org.eclipse.birt.report.model.api.activity.SemanticException e) {
            org.eclipse.birt.report.designer.internal.ui.util.ExceptionHandler.handle(e);
        }
    }else {
        viewer.getViewer().update(structureOrHandle, null);
    }
    if (validateAllComputedColumns())
        getContainer().setMessage(org.eclipse.birt.report.designer.nls.Messages.getString("dataset.editor.computedColumns"), IMessageProvider.NONE);
    
    updateColumnCache();
}