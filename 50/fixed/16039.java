public void set(int type, int u, int v) {
    this.u = u;
    this.v = v;
    this.type = type;
    status = fc.FCDynamicGraph.PUSHED;
}