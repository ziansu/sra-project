public void undo() {
    if (undoActive) {
        notifyReset();
        clearJustCreatedGeosInViews();
        getApplication().getActiveEuclidianView().getEuclidianController().clearSelections();
        ((geogebra.common.kernel.Construction) (cons)).undo();
        notifyReset();
        if (!(undoPossible()))
            notifyRepaint();
        
    }
}