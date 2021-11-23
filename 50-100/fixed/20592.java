@java.lang.Override
public void onDrag(org.rstudio.studio.client.workbench.views.source.editors.text.MouseDragEvent event) {
    double initialWidth = initialWidth_;
    double xDiff = event.getTotalDelta().getMouseX();
    double newSize = initialWidth - xDiff;
    double maxSize = (editorPanel_.getOffsetWidth()) + 1;
    double clamped = org.rstudio.core.client.MathUtil.clamp(newSize, 0, maxSize);
    if (clamped < 5)
        clamped = 0;
    
    editorPanel_.setWidgetSize(docOutlineWidget_, clamped);
    toggleDocOutlineButton_.setLatched((clamped != 0));
    editor_.onResize();
}