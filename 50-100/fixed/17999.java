@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent arg0) {
    layoutTopRight.setSelectionIdex(layoutTopLeft.getSelectionIndex());
    if ((layoutTopLeft.getSelectionIndex()) == 2) {
        layoutBottomLeft.setSelectionIdex(3);
    }else
        if ((layoutTopLeft.getSelectionIndex()) == 3) {
            layoutBottomLeft.setSelectionIdex(0);
            layoutBottomRight.setSelectionIdex(0);
        }
    
    controller.update(new org.deidentifier.arx.gui.model.ModelEvent(this, org.deidentifier.arx.gui.model.ModelEvent.ModelPart.SELECTED_RISK_VISUALIZATION, null));
}