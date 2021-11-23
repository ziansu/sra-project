private java.lang.Integer[] splitEventOps(int eventType) {
    java.util.List<java.lang.Integer> a = new java.util.ArrayList<java.lang.Integer>(4);
    int[] ops = new int[]{ OP_READ , OP_WRITE , OP_CONNECT , OP_ACCEPT };
    for (int op : ops)
        if ((op & eventType) == op)
            a.add(new java.lang.Integer(op));
        
    
    return a.toArray(new java.lang.Integer[a.size()]);
}