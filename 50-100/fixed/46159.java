@java.lang.Override
public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
    java.lang.System.out.println(event.getSelection());
    rocks.inspectit.ui.rcp.editor.ISubView tempView = getRootEditor().getSubView();
    if (tempView != null) {
        rocks.inspectit.ui.rcp.editor.map.MapSubView mapView = ((rocks.inspectit.ui.rcp.editor.map.MapSubView) (tempView.getSubViewWithInputController(rocks.inspectit.ui.rcp.editor.map.input.TraceMapInputController.class)));
        if (mapView != null) {
            mapView.setSelection(((org.eclipse.jface.viewers.IStructuredSelection) (event.getSelection())).toList());
        }
    }
}