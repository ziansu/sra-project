@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.nschmidt.ldparteditor.composites.compositetab.CompositeTab selection = ((org.nschmidt.ldparteditor.composites.compositetab.CompositeTab) (tabFolder[0].getSelection()));
    if (selection != null) {
        selection.getTextComposite().copy();
        selection.getTextComposite().forceFocus();
    }
}