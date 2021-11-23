public void reset() {
    super.reset();
    this.dist = 0;
    this.pi = this.p;
    this.pis.put(this.p, new VoronoiDiagram.Generator(this.p, 0, 0));
}