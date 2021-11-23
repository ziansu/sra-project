public void setCapacity(edmondskarp.Gui.Arrow arrow, int capacity) {
    arrow.getEdge().setCapacity(capacity);
    arrow.getEdge().getInverse().setCapacity(capacity);
    arrow.getEdge().getInverse().setFlow(capacity);
    saveState();
}