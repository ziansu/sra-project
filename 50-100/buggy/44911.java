public buildOrder.Project addNode(java.lang.String name) {
    buildOrder.Project n = new buildOrder.Project(name);
    if (!(ckr.containsKey(name))) {
        nodes.add(n);
        ckr.put(name, n);
    }
    return n;
}