public void setInVerties(java.util.LinkedHashSet<core.MyVertex> h1) {
    java.util.Iterator<core.MyVertex> I = h1.iterator();
    while (I.hasNext()) {
        core.MyVertex v = I.next();
        v.setLabel("IN");
        NotLabelledVertices.remove(v);
    } 
    InLabels = h1;
    NotLabelledVertices.removeAll(h1);
}