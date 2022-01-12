private int mergeAndUndo(structures.Node red, structures.Node blue) {
    merger.resetScore();
    merger.merge(red, blue, false);
    int res = ((merger.getScore()) >= 0) ? merger.getScore() : -(blue.getDepth());
    merger.undoMerge(red, blue);
    return res;
}