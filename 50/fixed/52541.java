public void addTo(de.blau.android.util.rtree.RTree.Node parent) {
    parent.children.add(this);
    this.parent = parent;
    computeMBR();
    splitter.split(parent);
}