private codebook.datastructures.TreapSimple.Node merge(codebook.datastructures.TreapSimple.Node t1, codebook.datastructures.TreapSimple.Node t2) {
    if (t1 == null)
        return t2;
    else
        if (t2 == null)
            return t1;
        
    
    codebook.datastructures.TreapSimple.Node newRoot = null;
    if ((t1.priority) > (t2.priority)) {
        t1.left = merge(t1.left, t1.right);
        newRoot = t1;
        newRoot.right = t2;
    }else {
        t2.right = merge(t2.left, t2.right);
        newRoot = t2;
        newRoot.left = t1;
    }
    return newRoot;
}