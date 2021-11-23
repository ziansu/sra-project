private void addAction() {
    try {
        if (((maxIndex) > (addIndex)) || ((canUndo) == false)) {
            undoList.set(addIndex, comp.deepCopy());
        }else {
            (maxIndex)++;
            undoList.addLast(comp.deepCopy());
        }
        undoIndex = addIndex;
        (addIndex)++;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}