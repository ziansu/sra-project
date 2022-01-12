public int length(int v, int w) {
    if (v == w) {
        return 0;
    }
    int common = ancestor(v, w);
    if (common == (-1)) {
        return -1;
    }
    edu.princeton.cs.algs4.BreadthFirstDirectedPaths vBFS = new edu.princeton.cs.algs4.BreadthFirstDirectedPaths(G, v);
    edu.princeton.cs.algs4.BreadthFirstDirectedPaths wBFS = new edu.princeton.cs.algs4.BreadthFirstDirectedPaths(G, w);
    return ((vBFS.distTo(common)) + (wBFS.distTo(common))) - 1;
}