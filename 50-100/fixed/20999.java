protected void createDiffViewer(final org.eclipse.ui.part.ViewPart view, final org.eclipse.swt.widgets.Composite parent, final de.setsoftware.reviewtool.model.changestructure.FileInRevision sourceRevision, final de.setsoftware.reviewtool.model.changestructure.FileInRevision targetRevision, final java.util.List<de.setsoftware.reviewtool.model.changestructure.Fragment> sourceFragments, final java.util.List<de.setsoftware.reviewtool.model.changestructure.Fragment> targetFragments) {
    if ((((sourceFragments == null) || (targetFragments == null)) || (sourceFragments.isEmpty())) || (targetFragments.isEmpty())) {
        this.createBinaryHunkViewer(view, parent);
    }else {
        this.createTextHunkViewer(parent, sourceRevision, targetRevision, sourceFragments, targetFragments);
    }
}