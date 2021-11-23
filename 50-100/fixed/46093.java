@java.lang.Override
protected void notifyhandleColumnHighlight(org.eclipse.swt.events.MouseEvent e) {
    if ((observers) == null) {
        return ;
    }
    for (org.talend.dataprofiler.core.ui.grid.utils.TDQObserver<org.talend.dataprofiler.core.ui.grid.utils.events.ObserverEvent> observer : observers) {
        org.talend.dataprofiler.core.ui.grid.utils.events.ObserverEvent observerEvent = new org.talend.dataprofiler.core.ui.grid.utils.events.ObserverEvent(org.talend.dataprofiler.core.ui.grid.utils.events.ObserverEventEnum.ColumnHighlight);
        org.eclipse.nebula.widgets.grid.GridColumn currentColumn = this.getColumn(new org.eclipse.swt.graphics.Point(e.x, e.y));
        if (currentColumn != null) {
            observerEvent.putData(ObserverEvent.COLUMN_HIGH_LIGHT, this.indexOf(currentColumn));
            observer.update(observerEvent);
        }
    }
}