@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent arg0) {
    layoutBottomRight.setSelectionIdex(layoutBottomLeft.getSelectionIndex());
    if ((layoutBottomLeft.getSelectionIndex()) == 3) {
        layoutTopLeft.setSelectionIdex(2);
        layoutTopRight.setSelectionIdex(2);
    }else
        if ((layoutBottomLeft.getSelectionIndex()) == 0) {
            layoutTopLeft.setSelectionIdex(3);
            layoutTopRight.setSelectionIdex(3);
        }
    
    controller.update(new org.deidentifier.arx.gui.model.ModelEvent(this, org.deidentifier.arx.gui.model.ModelEvent.ModelPart.SELECTED_RISK_VISUALIZATION, null));
}