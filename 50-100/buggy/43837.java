public void minimize(com.intellij.ui.content.Content[] contents) {
    myContext.saveUiState();
    for (final com.intellij.ui.content.Content each : contents) {
        myMinimizedContents.add(each);
        remove(each);
        boolean isShowing = (myTabs.getComponent().getRootPane()) != null;
        updateSelection(isShowing);
        myContainer.minimize(each, new com.intellij.execution.ui.layout.impl.CellTransform.Restore() {
            @java.lang.Override
            public com.intellij.openapi.util.ActionCallback restoreInGrid() {
                return restore(each);
            }
        });
    }
}