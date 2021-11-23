@java.lang.Override
public void figureMoved(org.eclipse.draw2d.IFigure source) {
    java.util.List selectedEditPart = getHost().getViewer().getSelectedEditParts();
    if (selectedEditPart.contains(getHost())) {
        showFeedback(true);
    }
}