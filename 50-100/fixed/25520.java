private codebook.datastructures.TreapSimple.Node merge(codebook.datastructures.TreapSimple.Node t1, codebook.datastructures.TreapSimple.Node t2) {
    if (t1 == null)
        return t2;
    else
        if (t2 == null)
            return t1;
        
    
    codebook.datastructures.TreapSimple.Node newRoot = null;
    if ((t1.priority) > (t2.priority)) {
        t1.right = merge(t1.right, t2);
        newRoot = t1;
    }else {
        t2.left = merge(t1, t2.left);
        newRoot = t2;
    }
    return newRoot;
}