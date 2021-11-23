public void recordSetCovariance(final net.trackmate.revised.model.mamut.Spot vertex) {
    final net.trackmate.undo.UndoableEditRef ref = createRef();
    boolean createNewEdit = true;
    if ((nextEditIndex) > 0) {
        final net.trackmate.undo.UndoableEditRef edit = get(((nextEditIndex) - 1), ref);
        createNewEdit = (!(setVertexPosition.isInstance(edit))) || (edit.isUndoPoint());
    }
    if (createNewEdit)
        create(ref).getEdit(setVertexCovariance).init(vertex);
    
    releaseRef(ref);
}