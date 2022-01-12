private void checkForSelection(java.awt.Point click) {
    currentSelectedEntity = clickedOnEntity(click);
    if ((currentSelectedEntity) != null)
        currentDebugEntity = currentSelectedEntity;
    
}