public void undo() {
    if (undoActive) {
        notifyReset();
        clearJustCreatedGeosInViews();
        getApplication().getActiveEuclidianView().getEuclidianController().clearSelections();
        cons.undo();
        notifyReset();
        if (!(undoPossible())) {
            notifyRepaint();
        }
    }
}