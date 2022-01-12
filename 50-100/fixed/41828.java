public void setUndecVertices(java.util.LinkedHashSet<core.MyVertex> h1) {
    java.util.Iterator<core.MyVertex> I = h1.iterator();
    while (I.hasNext()) {
        core.MyVertex v = I.next();
        v.setLabel("UNDEC");
        UndecLabels.add(v);
        NotLabelledVertices.remove(v);
    } 
    UndecLabels = h1;
    NotLabelledVertices.removeAll(h1);
}