public void push(java.lang.Object... l) {
    l = (l == null) ? new java.lang.Object[]{ null } : l;
    for (java.lang.Object d : l)
        h = new Node(d, h);
    
}