private void disposeLayer(com.nu.art.cyborg.core.CyborgStackController.StackLayer layerToBeDisposed) {
    if (layerToBeDisposed == null)
        return ;
    
    if (layerToBeDisposed.saveState) {
        layerToBeDisposed.saveState();
    }
    if (((layerToBeDisposed.controller) != null) && (!(layerToBeDisposed.controller.keepInStack)))
        layersStack.remove(layerToBeDisposed);
    
    layerToBeDisposed.detachView();
}