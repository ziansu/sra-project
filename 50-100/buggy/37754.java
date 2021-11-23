@java.lang.Override
public void dragOver(org.eclipse.swt.dnd.DropTargetEvent event) {
    final org.entirej.ide.ui.editors.report.ReportPreviewImpl.DragObject droppedObj = ((transfer.getSelection()) != null) ? ((org.entirej.ide.ui.editors.report.ReportPreviewImpl.DragObject) (((org.eclipse.jface.viewers.StructuredSelection) (transfer.getSelection())).getFirstElement())) : null;
    if (droppedObj != null) {
        droppedObj.indicate(event.x, event.y);
    }
}