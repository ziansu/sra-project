public void enqueue(java.lang.Object... l) {
    l = (l == null) ? new java.lang.Object[]{ "null" } : l;
    for (java.lang.Object d : l)
        t = (isEmpty()) ? h = new Node(d) : t.next(new Node(d));
    
}