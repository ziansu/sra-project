private int count(de.blau.android.util.rtree.RTree.Node n) {
    assert n != null;
    if (n.isLeaf()) {
        return n.data.size();
    }else {
        int sum = 0;
        for (int i = 0; i < (n.children.size()); i++)
            sum += count(n.children.get(i));
        
        return sum;
    }
}