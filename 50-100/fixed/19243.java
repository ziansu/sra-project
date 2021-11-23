private java.util.ArrayList<java.lang.Object> getAllObjectsAbove(com.climber.Quadtree.Node n) {
    if (n == null)
        return new java.util.ArrayList<java.lang.Object>();
    
    java.util.ArrayList<java.lang.Object> a = new java.util.ArrayList<java.lang.Object>();
    a.addAll(n.m_objects);
    if ((n.m_parent) == null)
        return a;
    
    a.addAll(getAllObjectsAbove(n.m_parent));
    return a;
}