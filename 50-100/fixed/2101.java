public void copy() {
    org.nschmidt.ldparteditor.composites.compositetab.CompositeTab selection = ((org.nschmidt.ldparteditor.composites.compositetab.CompositeTab) (tabFolder[0].getSelection()));
    if (selection != null) {
        selection.getTextComposite().copy();
        selection.getTextComposite().forceFocus();
    }
}