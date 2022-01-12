public buildOrder.Project addNode(java.lang.String name) {
    if (!(ckr.containsKey(name))) {
        buildOrder.Project n = new buildOrder.Project(name);
        nodes.add(n);
        ckr.put(name, n);
    }
    return ckr.get(name);
}