public void addAction(javax.swing.Action action, int flags) {
    if ((action.getValue(net.sourceforge.ganttproject.gui.AbstractTableAndActionsComponent.PROPERTY_IS_ENABLED_FUNCTION)) == null) {
        action.putValue(net.sourceforge.ganttproject.gui.AbstractTableAndActionsComponent.PROPERTY_IS_ENABLED_FUNCTION, createIsEnabledFunction(flags));
    }
    myAdditionalActions.add(action);
    if (action instanceof net.sourceforge.ganttproject.gui.AbstractTableAndActionsComponent.SelectionListener) {
        addSelectionListener(((net.sourceforge.ganttproject.gui.AbstractTableAndActionsComponent.SelectionListener<T>) (action)));
    }
}