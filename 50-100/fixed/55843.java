void populateTxtFields() {
    final java.util.ListIterator<CellCntrMarkerVector> it = typeVector.listIterator();
    while (it.hasNext()) {
        final int index = it.nextIndex();
        if ((txtFieldVector.size()) > index) {
            final CellCntrMarkerVector markerVector = it.next();
            final int count = markerVector.size();
            final javax.swing.JTextField tArea = txtFieldVector.get(index);
            tArea.setText(("" + count));
        }
    } 
    validateLayout();
}