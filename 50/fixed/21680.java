@java.lang.Override
public void createContents(final org.eclipse.swt.widgets.Composite viewArea, final java.util.Map<java.lang.String, org.eclipse.swt.graphics.Image> imageMap) {
    this.viewArea = viewArea;
    this.imageMap = imageMap;
    createBaseFrame();
    populateTopComposite();
    populateBottomComposite();
}