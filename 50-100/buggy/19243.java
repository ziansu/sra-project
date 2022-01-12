private java.util.ArrayList<java.lang.Object> getAllObjectsAbove(com.climber.Quadtree.Node n) {
    if (n == null)
        return new java.util.ArrayList<java.lang.Object>();
    
    if ((n.m_parent) == null) {
        return n.m_objects;
    }
    java.util.ArrayList<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.addAll(getAllObjectsAbove(n.m_parent));
    list.addAll(n.m_objects);
    return list;
}