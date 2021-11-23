public Node getNode() {
    Node n = new Node(false);
    java.util.ArrayList<java.lang.Integer> nt = new java.util.ArrayList<>();
    for (int i = 0; i < (cons.size()); i++) {
        nt.add((0 + (cons.get(i))));
    }
    n.cons = nt;
    n.val = val;
    n.gin = gin;
    return n;
}