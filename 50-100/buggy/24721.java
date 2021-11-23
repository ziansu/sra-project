@java.lang.Override
public boolean handleChange(java.lang.Object oldValue, java.lang.Object newValue, org.eclipse.draw2d.IFigure figure) {
    if (newValue.toString().equals(""))
        figure.setToolTip(null);
    else {
        if ((tooltipLabel) == null)
            tooltipLabel = new org.csstudio.opibuilder.visualparts.TooltipLabel(getWidgetModel());
        
        figure.setToolTip(tooltipLabel);
    }
    return false;
}