public void set(int type, int u, int v) {
    this.type = type;
    this.u = u;
    this.v = v;
    status = fc.FCDynamicGraph.PUSHED;
}