public void addNode(java.lang.String StateName) {
    my.east.Node newNode = new my.east.Node(StateName);
    if (!(V.containsKey(newNode)))
        V.put(StateName, newNode);
    
}