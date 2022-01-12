public java.util.ArrayList<ExploredGraph.Vertex> retrievePath(ExploredGraph.Vertex vi) {
    for (int i = 0; i < (this.path.size()); i++) {
        ExploredGraph.Vertex vf = this.path.get(i);
        if (vf.equals(vi)) {
            return new java.util.ArrayList<ExploredGraph.Vertex>(this.path.subList(0, i));
        }
    }
    return null;
}