private void hookListeners() {
    selectionListener = new ca.concordia.jsdeodorant.eclipseplugin.listeners.JSDeodorantSelectionListener(this);
    getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(selectionListener);
    partListener = new ca.concordia.jsdeodorant.eclipseplugin.listeners.JSDeodorantPartListener(this);
    getSite().getWorkbenchWindow().getPartService().addPartListener(partListener);
}