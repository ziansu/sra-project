@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if ((tabFolder[0].getSelection()) != null) {
        saveAs(((org.nschmidt.ldparteditor.composites.compositetab.CompositeTab) (tabFolder[0].getSelection())).getState().getFileNameObj(), null);
    }
}