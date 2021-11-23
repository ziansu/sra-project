private void range(KdTree.Node rt, edu.princeton.cs.algs4.RectHV rect, java.util.ArrayList<edu.princeton.cs.algs4.Point2D> range) {
    if (rt == null)
        return ;
    
    if (rect.intersects(rt.rect)) {
        if (rect.contains(rt.p))
            range.add(rt.p);
        
        range(rt.lb, rect, range);
        range(rt.rt, rect, range);
    }
}