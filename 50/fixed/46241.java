public void setFlow(edmondskarp.Gui.Arrow arrow, int flow) {
    arrow.getEdge().setFlow(flow);
    arrow.getEdge().getInverse().setFlow((-flow));
    saveState();
}