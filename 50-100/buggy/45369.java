public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
    switch (e.keyCode) {
        case org.eclipse.swt.SWT.DEL :
        case org.eclipse.swt.SWT.BS :
            removeSelected();
            break;
        case org.eclipse.swt.SWT.INSERT :
            addNew();
            break;
        case org.eclipse.swt.SWT.CR :
        case org.eclipse.swt.SWT.F2 :
            lastNewName = "";
            java.lang.Object el = ((org.eclipse.jface.viewers.StructuredSelection) (viewer.getSelection())).getFirstElement();
            if (el != null)
                viewer.editElement(el, 0);
            else
                viewer.editElement(org.eclipse.rcptt.ui.editors.ScenarioProperties.newParameterItem, 0);
            
            break;
    }
}