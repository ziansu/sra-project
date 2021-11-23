public boolean deleteFromUndecVertices(core.MyVertex v) {
    if (!(this.UndecLabels.contains(v))) {
        throw new java.lang.IllegalArgumentException("This vertex is not in the undec hashset");
    }else {
        NotLabelledVertices.add(v);
        v.setLabel("NONE");
        UndecLabels.remove(v);
        NotLabelledVertices.remove(v);
    }
    return true;
}