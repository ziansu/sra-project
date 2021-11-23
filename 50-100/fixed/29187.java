private void onCoordinatesChanged(java.lang.Object source, eu.transkribus.core.model.beans.pagecontent_trp.observable.TrpObserveEvent.TrpCoordsChangedEvent e) {
    if (source instanceof eu.transkribus.core.model.beans.pagecontent_trp.TrpPrintSpaceType) {
    }else
        if (source instanceof eu.transkribus.core.model.beans.pagecontent_trp.TrpTextRegionType) {
        }else
            if (source instanceof eu.transkribus.core.model.beans.pagecontent_trp.TrpTextLineType) {
                lineEditor.updatePosition();
            }else
                if (source instanceof eu.transkribus.core.model.beans.pagecontent_trp.TrpBaselineType) {
                }
            
        
    
    mainWidget.getUi().getStructureTreeWidget().updateTextLabels(source);
}